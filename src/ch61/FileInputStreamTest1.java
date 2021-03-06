package ch61;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch(Exception e2) { // null인데 close를 할 경우 문제가 되기 때문에 Exception을 하나 걸어둔다
				System.out.println(e2);
			}
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e2) { // null인데 close를 할 경우 문제가 되기 때문에 Exception을 하나 걸어둔다
				System.out.println(e2);
			}
		}
		
		System.out.println("END");
	}
}
