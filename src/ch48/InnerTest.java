package ch48;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)"); // error
			// 정적 클래스가 외부 클래스와 상관없이 만들어 질 수 있기 때문에 외부 클래스의 인스턴스 변수를 사용할 수 없습니다.(static 변수도 마찬가지이다.)
			System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 static 변수)");
		}
		
		static void sTest() { // static 변수만 호출 가능
			// System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스 변수)"); // error
			// static 클래스의 static 메서드는 정말 이 클래스가 생성되지 않아도 호출될 수 있다. 그때는 이 변수가 생성이 안되었을 수도 있다. 그래서 사용할 수 없다.
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 static 변수)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		// 인스턴스 내부 클래스
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println();
		
		// private이 아닌 경우
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		// 정적 내부 클래스
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
