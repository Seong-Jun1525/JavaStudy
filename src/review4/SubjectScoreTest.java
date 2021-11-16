package review4;

public class SubjectScoreTest {

	public static void main(String[] args) {
		Student studentLim = new Student(1001, "Lim");
		
		studentLim.addSubject("국어", 100);
		studentLim.addSubject("수학", 50);
		
		Student studentWoo = new Student(1002, "Woo");
		
		studentWoo.addSubject("국어", 70);
		studentWoo.addSubject("수학", 85);
		studentWoo.addSubject("영어", 100);
		
		studentLim.showInfo();
		System.out.println("===============================");
		studentWoo.showInfo();
	}
}