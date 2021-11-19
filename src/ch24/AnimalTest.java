package ch24;

import java.util.ArrayList;

class Animal {
	// ���������� ����ϴ� �޼���� ���� Ŭ������ �����մϴ�.
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �糯���� �� ��� ���� �ٴմϴ�.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal h = new Human();
		Animal t = new Tiger();
		Animal e = new Eagle();
//		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(h);
//		test.moveAnimal(e);
//		test.moveAnimal(t);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(h);
		animalList.add(e);
		animalList.add(t);
		
		for (Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
