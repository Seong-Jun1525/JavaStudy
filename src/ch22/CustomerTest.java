package ch22;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLim = new Customer(10010, "Seong Jun");
		customerLim.bonusPoint = 1000;
		
		System.out.println(customerLim.showCustomerInfo());
		
		VIPCustomer customerWoo = new VIPCustomer(10011, "Woo");
		customerWoo.bonusPoint = 10000;

		System.out.println(customerWoo.showCustomerInfo());
	}
}