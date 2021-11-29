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
		
		Class c2 = person.getClass(); // getClass를 사용하려면 이미 인스턴스가 있는 상태이어야 한다.
		Person p = (Person)c2.newInstance();
		
		System.out.println(p); // null
		
		
		// Person woo = new Person("woo"); <- 위의 Class를 가져오는 17번째 줄의 코드와 아래 5줄의 코드랑 같은 의미
		// 보통 아래처럼 사용하지 않는다. 아래와 같은 코드는 로컬에 Person이 없을때 사용한다.
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Woo"};
		Person woo = (Person)cons.newInstance(initargs);
		System.out.println(woo);
		
	}

}
