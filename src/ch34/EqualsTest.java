package ch34;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "SJ");
		Student std2 = new Student(100, "SJ");
		Student std3 = std1;
		
		System.out.println(std1 == std2); // false
		System.out.println(std1 == std3); // true
		
		System.out.println(std1.equals(std2)); // false이지만 Student에서 주소는 다르지만 논리적으로 같다는 것을 재정의해주면 true가 출력됩니다.
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
//		다른값이 나옵니다.
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		
		std1.setStudentName("Woo");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		
		
		
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1.equals(str2)); // true
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		Integer i = 100;
//		System.out.println(i.hashCode()); // 100
	}

}
