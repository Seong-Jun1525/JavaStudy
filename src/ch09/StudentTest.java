package ch09;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLim = new Student();
		
		studentLim.studentID = 201907012;
		studentLim.setStudentName("Seong Jun");
		studentLim.address = "��õ";
		
		studentLim.showStudentInfo();
		
		Student studentWoo = new Student();
		
		studentWoo.studentID = 10241028;
		studentWoo.setStudentName("Woo");
		studentWoo.address = "��õ";
		
		studentWoo.showStudentInfo();
	}

}
