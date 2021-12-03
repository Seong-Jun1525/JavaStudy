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
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ static ����)");
			System.out.println("OutClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)"); // error
			// ���� Ŭ������ �ܺ� Ŭ������ ������� ����� �� �� �ֱ� ������ �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� �����ϴ�.(static ������ ���������̴�.)
			System.out.println("OutClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ static ����)");
			System.out.println("OutClass sInNum = " + sInNum + "(���� Ŭ������ static ����)");
		}
		
		static void sTest() { // static ������ ȣ�� ����
			// System.out.println("OutClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)"); // error
			// static Ŭ������ static �޼���� ���� �� Ŭ������ �������� �ʾƵ� ȣ��� �� �ִ�. �׶��� �� ������ ������ �ȵǾ��� ���� �ִ�. �׷��� ����� �� ����.
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ static ����)");
			System.out.println("OutClass sInNum = " + sInNum + "(���� Ŭ������ static ����)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		// �ν��Ͻ� ���� Ŭ����
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println();
		
		// private�� �ƴ� ���
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		// ���� ���� Ŭ����
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
