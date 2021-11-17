package ch21;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLim = new Customer();
		customerLim.setCustomerName("Seong Jun");
		customerLim.setCustomerID(10010);
		customerLim.bonusPoint = 1000;
		
		System.out.println(customerLim.showCustomerInfo());
		
		VIPCustomer customerWoo = new VIPCustomer();
		customerWoo.setCustomerName("Woo");
		customerWoo.setCustomerID(10011);
		customerWoo.bonusPoint = 10000;
		customerWoo.showCustomerInfo();

		System.out.println(customerWoo.showCustomerInfo());
	}
}