package ch36;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
		IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c1 = Class.forName("ch36.Person");
		
		Person person = (Person)c1.newInstance();
		
		person.setName("Lim");
		System.out.println(person); // Lim
		
		Class c2 = person.getClass(); // getClass�� ����Ϸ��� �̹� �ν��Ͻ��� �ִ� �����̾�� �Ѵ�.
		Person p = (Person)c2.newInstance();
		
		System.out.println(p); // null
		
		
		// Person woo = new Person("woo"); <- ���� Class�� �������� 17��° ���� �ڵ�� �Ʒ� 5���� �ڵ�� ���� �ǹ�
		// ���� �Ʒ�ó�� ������� �ʴ´�. �Ʒ��� ���� �ڵ�� ���ÿ� Person�� ������ ����Ѵ�.
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Woo"};
		Person woo = (Person)cons.newInstance(initargs);
		System.out.println(woo);
		
	}

}
