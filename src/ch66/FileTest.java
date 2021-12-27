package ch66;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\hi5k1\\Desktop\\Seong-Jun\\Java-Study\\JavaStudy\\newFile.txt"); // 파일은 없어도 디렉토리 경로는 있어야함.
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
	}
}