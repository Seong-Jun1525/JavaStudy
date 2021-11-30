package ch41;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // <> : ���̾Ƹ�� ������
		powderPrinter.setMeterial(powder);
		
		Powder p = powderPrinter.getMaterial(); // ����ȯ�� ���� �ʴ´�.
		// ����ȯ�� ���� �ʴ� ���� : GenericPrinter<Powder>�̷��� �ۼ��ϸ� �����ϵ� �� GenericPrinter Ŭ������ �ִ� ��� T�� Powder�� �ٲ�.
		
		System.out.println(powderPrinter.toString());
		
	}

}
