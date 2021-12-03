package ch49;

class Outer2 {
	
	int outNum = 100; // 멤버 변수는 생성자에서 하는게 좋은 방법이지만 예제이기 때문에 그냥 함.
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // i는 stack 메모리에 생성
		int num = 10; // num은 stack 메모리에 생성
		
		return new Runnable() {
			
			int localNum = 1000;
			
			@Override
			public void run() {
				
//				i = 50; // error
//				num = 20; // error
//				가져다 출력할 때는 error가 생기지 않는다.
//				하지만 값을 바꾸려고 하면 error가 생긴다.
//				Error가 생기는 이유는 getRunnable() 메서드가 호출되는 시점이랑 MyRunnable클래스가 생성 주기가 다르기 때문이다.
//				getRunnable 메서드의 호출이 끝나면 Stack 메모리에 잡힌 i와 num은 없어진다.
//				하지만 run()메서드는 getRunnable을 받고나면 나중에 또 호출될 수 있다.
//				그런데 또 호출되었을 때 i, num은 없을 수도 있다.
//				없으면 그 값을 assign을 못한다. 그러면 값을 바꿔줄 수 없다.
//				즉, i와 num은 stack메모리에 생성이 되는건데 stack에 잡히면 안된다.
//				그래서 컴파일러가 자동으로 final로 처리한다.
//				외부 메서드에서 있는 변수를 익명 내부 클래스안에서 쓸 때 오류가 난다.
//				예전에는 final로 선언하라고 했지만 지금은 컴파일러가 자동으로 final로 변환해준다.
//				즉, 스택에 잡히지 않는다. 상수메모리에 잡힌다. 그래서 값을 바꿀 수 없다.
				
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
		};
	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable class");
		}
		
	};
}

public class AnonumousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
