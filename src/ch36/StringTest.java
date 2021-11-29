package ch36;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		
		Constructor<String>[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		System.out.println("==================");
		
		Method[] m = c.getMethods();
		
		for(Method mth : m) {
			System.out.println(mth);
		}
	}

}
