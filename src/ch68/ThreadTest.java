package ch68;

class MyThread implements Runnable {

	@Override
	public void run() {
		int i;
		
		for(i = 1; i <= 200; i++) {
			System.out.print(i + " ");
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		
		MyThread runnable = new MyThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
//		총 3개의 스레드가 돌아감.
//		main, th1, th2
//		main Thread는 Thread 2개 생성하고 start하고 end
		
		// 간단하게 돌리는 방법
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		run.run();
		
	}

}
