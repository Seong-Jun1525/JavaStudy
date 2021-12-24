package ch64;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millsecond = 0;
		
//		FileInputStream, FileOutputStream���� �ϸ� �� ����Ʈ�� �����ϱ� ������ ���� �ɸ�
//		�׷��� BufferedInputStream, BufferedOutputStream���� ���� �ش�
//		134803 �ҿ� -> 379 �ҿ�� ���� �پ��
		
//		FileReader�� ���� BufferedReader�� ���θ� ��
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
			
			millsecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millsecond = System.currentTimeMillis() - millsecond;
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millsecond + " �ҿ�Ǿ����ϴ�.");
		
		
		Socket socket = new Socket();
		
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// inputStream�̵� ouputStream�̵� byte�����θ� ó���Ǳ⶧���� ����θ� �ۼ��ؾ���.
		// �׷��� InputStreamReader�� ������. �׷� �ѱ۵� ����
		// �ٵ� �ӵ��� �����⶧���� �ӵ��� ����Ű�� ���� BufferedReader�� �����ش�
	}

}
