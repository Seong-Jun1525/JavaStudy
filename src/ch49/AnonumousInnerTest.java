package ch49;

class Outer2 {
	
	int outNum = 100; // ��� ������ �����ڿ��� �ϴ°� ���� ��������� �����̱� ������ �׳� ��.
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // i�� stack �޸𸮿� ����
		int num = 10; // num�� stack �޸𸮿� ����
		
		return new Runnable() {
			
			int localNum = 1000;
			
			@Override
			public void run() {
				
//				i = 50; // error
//				num = 20; // error
//				������ ����� ���� error�� ������ �ʴ´�.
//				������ ���� �ٲٷ��� �ϸ� error�� �����.
//				Error�� ����� ������ getRunnable() �޼��尡 ȣ��Ǵ� �����̶� MyRunnableŬ������ ���� �ֱⰡ �ٸ��� �����̴�.
//				getRunnable �޼����� ȣ���� ������ Stack �޸𸮿� ���� i�� num�� ��������.
//				������ run()�޼���� getRunnable�� �ް��� ���߿� �� ȣ��� �� �ִ�.
//				�׷��� �� ȣ��Ǿ��� �� i, num�� ���� ���� �ִ�.
//				������ �� ���� assign�� ���Ѵ�. �׷��� ���� �ٲ��� �� ����.
//				��, i�� num�� stack�޸𸮿� ������ �Ǵ°ǵ� stack�� ������ �ȵȴ�.
//				�׷��� �����Ϸ��� �ڵ����� final�� ó���Ѵ�.
//				�ܺ� �޼��忡�� �ִ� ������ �͸� ���� Ŭ�����ȿ��� �� �� ������ ����.
//				�������� final�� �����϶�� ������ ������ �����Ϸ��� �ڵ����� final�� ��ȯ���ش�.
//				��, ���ÿ� ������ �ʴ´�. ����޸𸮿� ������. �׷��� ���� �ٲ� �� ����.
				
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
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
