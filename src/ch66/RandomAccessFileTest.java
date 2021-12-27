package ch66;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���"); // �� ���ڴ� 3byte ��, 3*5 = 15 �������� null�� �ִ� null�� 2byte �׷��� 17�̴�. 12 + 17�� 29
		System.out.println("pos: " + rf.getFilePointer());
		
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
