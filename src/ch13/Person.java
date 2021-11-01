package ch13;

public class Person {
	String name;
	int age;
	
	public Person() {
		// code 작성 x
		this("이름없음", 1);
		// code 작성 o
	}
	
	public Person(String name ,int age) {
		this.name = name;
		this.age = age;
	}
	
//	public void showPerson() {
//		System.out.println(name + ", " + age);
//	}
//	
//	public static void main(String[] args) {
//		Person person = new Person();
//		
//		person.showPerson();
//		
//	}
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "Jun";
		p.age = 22;
		
		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);
		
	}
}
