package ch62;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt");
		
				
		try(fos) { // 해당 파일이 없으면 만들어 준다.
			byte[] bs = new byte[26];
			
			byte data = 65;
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs, 2, 10); // 배열의 2번째 위치부터 10개 바이트 출력하기
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
