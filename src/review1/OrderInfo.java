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
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + orderPhone);
		System.out.println("주문 집 주소 : " + orderAddress);
		System.out.println("주문 날짜 : " + format1.format(orderDate));
		System.out.println("주문 시간 : " + format2.format(orderTime));
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + menuNum);
	}
}
