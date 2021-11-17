package ch22;

public class VIPCustomer extends Customer {
	double salesRatio;
	String agentID;
	
//	public VIPCustomer() {
//		super(0, "No-Name");
//		
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	public String getAgentID() {
		return agentID;
	}
}