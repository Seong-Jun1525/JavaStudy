package ch67;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		// 상위 클래스에서 Default constructor가 없으면
		// 하위 클래스는 반드시 매개변수가 있는 constructor가 super를 명시적으로 호출해야함. 
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}
}
