package ch31;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 2;
		
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		calc.description();
		
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr)); // static 메서드이기 때문에 인터페이스이름으로 바로 호출해서 사용할 수 있습니다.
	}

}
