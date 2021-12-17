package ch57;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		// throws는 미루겠다는 의미
		// 이 Exception들은 여기서 발생할 수 있지만 여기서 핸들링 하지 않겠다는 의미
		// loadClass를 쓰는 쪽에서 핸들리을 한다
		FileInputStream fis = new FileInputStream(fileName);
		
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
//			또 다른 Exception이 발생할 수 있는데 그것이 무엇인지는 모를 때
//			그거에 대해 디폴트로 핸들링 하고 싶을때 default로 핸들링을 하고싶으면
//			최상위 Exception을 넣음 
//			중요한 것은 Default Exception을 맨 위에 작성하면 Error
		}
		
		System.out.println("END");
		
	}

}
