package review4;

public class SubjectScoreTest {

	public static void main(String[] args) {
		Student studentLim = new Student(1001, "Lim");
		
		studentLim.addSubject("����", 100);
		studentLim.addSubject("����", 50);
		
		Student studentWoo = new Student(1002, "Woo");
		
		studentWoo.addSubject("����", 70);
		studentWoo.addSubject("����", 85);
		studentWoo.addSubject("����", 100);
		
		studentLim.showInfo();
		System.out.println("===============================");
		studentWoo.showInfo();
	}
}