package ch62;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt");
		
				
		try(fos) { // �ش� ������ ������ ����� �ش�.
			byte[] bs = new byte[26];
			
			byte data = 65;
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs, 2, 10); // �迭�� 2��° ��ġ���� 10�� ����Ʈ ����ϱ�
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
