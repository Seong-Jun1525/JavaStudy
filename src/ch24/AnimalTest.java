package ch24;

import java.util.ArrayList;

class Animal {
	// 공통적으로 사용하는 메서드는 상위 클래스에 선언합니다.
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아 다닙니다.");
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
