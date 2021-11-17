package ch23;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLim = new Customer(10010, "Seong Jun");
		customerLim.bonusPoint = 1000;
		int price = customerLim.calcPrice(1000);
		
		System.out.println(customerLim.showCustomerInfo() + price);
		
		VIPCustomer customerWoo = new VIPCustomer(10011, "Woo");
		customerWoo.bonusPoint = 10000;
		price = customerWoo.calcPrice(1000);

		System.out.println(customerWoo.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(12345, "No-Name");
		System.out.println(vc.calcPrice(1000));
	}
}