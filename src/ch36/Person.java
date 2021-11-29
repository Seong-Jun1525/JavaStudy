package ch36;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name;
	}
}
