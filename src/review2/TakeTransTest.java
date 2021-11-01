package review2;

public class TakeTransTest {

	public static void main(String[] args) {
		Student s1 = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("잘 나간다 운수");
		
		s1.takeTaxi(taxi);
		
		s1.showInfo();
		taxi.showTaxiInfo();
	}
}
