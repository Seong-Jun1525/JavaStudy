package ch29;

public abstract class Calculator implements Calc {

//	4���� �޼��带 �� �������� �ʱ� ������ abstract�� �Ǿ�� �մϴ�.
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
