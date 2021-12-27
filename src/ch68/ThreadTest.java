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
		
//		�� 3���� �����尡 ���ư�.
//		main, th1, th2
//		main Thread�� Thread 2�� �����ϰ� start�ϰ� end
		
		// �����ϰ� ������ ���
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		run.run();
		
	}

}
