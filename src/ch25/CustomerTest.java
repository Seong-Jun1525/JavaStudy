package ch25;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerLim = new Customer(10010, "Seong Jun");
//		customerLim.bonusPoint = 1000;
//		int price = customerLim.calcPrice(1000);
//		
//		System.out.println(customerLim.showCustomerInfo() + price);
//		
//		VIPCustomer customerWoo = new VIPCustomer(10011, "Woo");
//		customerWoo.bonusPoint = 10000;
//		price = customerWoo.calcPrice(1000);
//
//		System.out.println(customerWoo.showCustomerInfo() + price);
//		
//		Customer vc = new VIPCustomer(12345, "No-Name");
//		System.out.println(vc.calcPrice(1000));
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(10010, "Lim");
		Customer customerT = new Customer(10020, "Tom");
		Customer customerW = new GoldCustomer(10030, "Woo");
		Customer customerK = new GoldCustomer(10040, "Kim");
		Customer customerJ = new VIPCustomer(10050, "Jam");
		
		customerList.add(customerJ);
		customerList.add(customerK);
		customerList.add(customerW);
		customerList.add(customerT);
		customerList.add(customerL);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
		}
	}
}