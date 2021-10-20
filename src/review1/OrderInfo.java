package review1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderInfo {
	public String orderPhone;
	public String orderAddress;
	public Date orderDate = new Date();
	public Date orderTime = new Date();
	public int orderPrice;
	public String menuNum;
	public String orderNum = orderDate + menuNum;
	
	SimpleDateFormat format1 = new SimpleDateFormat ("yyyyMMdd");
	SimpleDateFormat format2 = new SimpleDateFormat ("HHmmss");
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + orderPhone);
		System.out.println("�ֹ� �� �ּ� : " + orderAddress);
		System.out.println("�ֹ� ��¥ : " + format1.format(orderDate));
		System.out.println("�ֹ� �ð� : " + format2.format(orderTime));
		System.out.println("�ֹ� ���� : " + orderPrice);
		System.out.println("�޴� ��ȣ : " + menuNum);
	}
}
