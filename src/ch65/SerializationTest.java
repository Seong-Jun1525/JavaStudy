package ch65;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Externalizable { // Serializable는 구현코드 x. 이 객체가 직렬화 가능하다라는 것을 명시. 마크 인터페이스라고도 함.
	String name;
	String job;
//	transient String job;
//	직렬화가 안되는 멤버를 가지고 있을 경우 해당 멤버 앞에 transient를 작성
//	그럴 경우 복원할 때 넣어 주는 값은 디폴트 값이다
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

	
	// 직렬화를 어떻게 할 것인지 직접 구현
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeUTF(name);
		obj.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();
		
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "대장");
		Person personLim = new Person("Lim", "왕");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// writeObject를 할 때 Serializable 인터페이스가 명시되어 있지 않으면 error가 생기기 때문에 꼭 Serializable를 명시해줘야 한다
			oos.writeObject(personLee);
			oos.writeObject(personLim);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)) {
			Person pLee = (Person)ois.readObject();
			Person pLim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pLim);
		} catch(IOException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
