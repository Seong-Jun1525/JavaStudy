package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		Student s1 = new Student("James", 5000);
		Student s2 = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		s1.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		s2.takeSubway(greenSubway);
		
		s1.showInfo();
		s2.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		
		bus500.showBusInfo();
	}
}
