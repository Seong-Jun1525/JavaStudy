package ch11;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLim = new Student(001, "Lim");
		studentLim.setKoreanSubject(100, "����");
		studentLim.setMathSubject(100, "����");
		
		Student studentWoo = new Student(002, "Woo");
		studentWoo.setKoreanSubject(100, "����");
		studentWoo.setMathSubject(100, "����");
		
		
		studentLim.showStudentScore();
		studentWoo.showStudentScore();
	}

}
