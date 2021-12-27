package ch69;

public class JoinTest extends Thread {

	int start;
	int end;
	int total;
	// 특별히 초기화하지 않아도 기본값 0으로 초기화됨. 이유는 멤버 변수이기 때문이다. 지역변수일 경우에는 반드시 초기화 해야함.
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start; i <= end; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + "start");
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		System.out.println("lastTotal = " + lastTotal);

		System.out.println(Thread.currentThread() + "end");
//		main, jt1, jt2 3개의 Thread가 돌아가는 상태.
//		main은 jt1, jt2 Thread를 생성하고 start함.
//		lastTotal을 확인을 할때에는 jt1, jt2가 끝나지 않은 상태.
//		즉, lastTotal에 두개의 total값을 더하는 명령을 수행할때 더한 값을 출력.
//		이 값은 출력할때마다 바뀔 수 있음.
//		main이 필요한 것은 jt1, jt2의 결과다.
//		그래서 main이 도는 동안 join을 건다.
//		join을 걸면 main은 수행을 하지않는다. join걸고 끝날때까지 not runnable상태로 빠지기때문에 기다린다.
	}

}
