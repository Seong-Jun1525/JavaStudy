package ch57;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		// throws�� �̷�ڴٴ� �ǹ�
		// �� Exception���� ���⼭ �߻��� �� ������ ���⼭ �ڵ鸵 ���� �ʰڴٴ� �ǹ�
		// loadClass�� ���� �ʿ��� �ڵ鸮�� �Ѵ�
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
//			�� �ٸ� Exception�� �߻��� �� �ִµ� �װ��� ���������� �� ��
//			�װſ� ���� ����Ʈ�� �ڵ鸵 �ϰ� ������ default�� �ڵ鸵�� �ϰ������
//			�ֻ��� Exception�� ���� 
//			�߿��� ���� Default Exception�� �� ���� �ۼ��ϸ� Error
		}
		
		System.out.println("END");
		
	}

}
