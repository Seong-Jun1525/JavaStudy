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
		
//		FileInputStream, FileOutputStream으로 하면 한 바이트씩 읽으니깐 굉장히 오래 걸림
//		그래서 BufferedInputStream, BufferedOutputStream으로 묶어 준다
//		134803 소요 -> 379 소요로 많이 줄어듬
		
//		FileReader인 경우는 BufferedReader로 감싸면 됨
		
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
		
		System.out.println(millsecond + " 소요되었습니다.");
		
		
		Socket socket = new Socket();
		
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// inputStream이든 ouputStream이든 byte단위로만 처리되기때문에 영어로만 작성해야함.
		// 그래서 InputStreamReader로 감싸줌. 그럼 한글도 가능
		// 근데 속도가 느리기때문에 속도를 향상시키기 위해 BufferedReader로 감싸준다
	}

}
