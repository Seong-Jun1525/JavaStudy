package ch29;

public abstract class Calculator implements Calc {

//	4개의 메서드를 다 구현하지 않기 때문에 abstract가 되어야 합니다.
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
