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

class Person implements Externalizable { // Serializable�� �����ڵ� x. �� ��ü�� ����ȭ �����ϴٶ�� ���� ���. ��ũ �������̽���� ��.
	String name;
	String job;
//	transient String job;
//	����ȭ�� �ȵǴ� ����� ������ ���� ��� �ش� ��� �տ� transient�� �ۼ�
//	�׷� ��� ������ �� �־� �ִ� ���� ����Ʈ ���̴�
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

	
	// ����ȭ�� ��� �� ������ ���� ����
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
		Person personLee = new Person("�̼���", "����");
		Person personLim = new Person("Lim", "��");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// writeObject�� �� �� Serializable �������̽��� ��õǾ� ���� ������ error�� ����� ������ �� Serializable�� �������� �Ѵ�
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
