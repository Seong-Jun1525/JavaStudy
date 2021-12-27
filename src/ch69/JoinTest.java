package ch69;

public class JoinTest extends Thread {

	int start;
	int end;
	int total;
	// Ư���� �ʱ�ȭ���� �ʾƵ� �⺻�� 0���� �ʱ�ȭ��. ������ ��� �����̱� �����̴�. ���������� ��쿡�� �ݵ�� �ʱ�ȭ �ؾ���.
	
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
//		main, jt1, jt2 3���� Thread�� ���ư��� ����.
//		main�� jt1, jt2 Thread�� �����ϰ� start��.
//		lastTotal�� Ȯ���� �Ҷ����� jt1, jt2�� ������ ���� ����.
//		��, lastTotal�� �ΰ��� total���� ���ϴ� ����� �����Ҷ� ���� ���� ���.
//		�� ���� ����Ҷ����� �ٲ� �� ����.
//		main�� �ʿ��� ���� jt1, jt2�� �����.
//		�׷��� main�� ���� ���� join�� �Ǵ�.
//		join�� �ɸ� main�� ������ �����ʴ´�. join�ɰ� ���������� not runnable���·� �����⶧���� ��ٸ���.
	}

}
