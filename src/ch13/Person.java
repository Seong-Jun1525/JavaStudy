package ch13;

public class Person {
	String name;
	int age;
	
	public Person() {
		// code �ۼ� x
		this("�̸�����", 1);
		// code �ۼ� o
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
