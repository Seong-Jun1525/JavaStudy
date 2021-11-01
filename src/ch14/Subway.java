package ch14;

public class Subway {
	int subwayNum;
	int passengerCount;
	int money;
	
	public Subway(int subwayNum) {
		this.subwayNum = subwayNum;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNum + "번의 승객 수는 " + passengerCount + "명 이고 수입은 " + money + "원 입니다.");
	}
}
