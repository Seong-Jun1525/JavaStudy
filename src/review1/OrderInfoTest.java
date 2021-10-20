package review1;

import java.text.SimpleDateFormat;

public class OrderInfoTest {

	public static void main(String[] args) {
		OrderInfo order = new OrderInfo();
		
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyyMMdd");
		
		order.orderPhone = "01012345678";
		order.orderAddress = "¿Œ√µ";
		String time1 = format1.format(order.orderDate);
		
		
		order.orderPrice = 35000;
		order.menuNum = order.menuNum = "0003";
		order.orderNum = time1 + order.menuNum;
		
		order.showOrderInfo();
	}

}
