package ch52;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		
		is.forEach(n -> System.out.println(n));
		
		System.out.println();
		
//		is. �ڵ� �� ������� ������ ������ ������� �� error�� ����. �ֳĸ� �ѹ� ������ ����ǰ� ���� �Ҹ� �Ǳ� ����.
		
		int sum = Arrays.stream(arr).sum(); // �׷��� ������ �� �ٸ� ������ ����ϱ� ���ؼ��� ��Ʈ���� �ٽ� �����Ͽ��� ��.
		System.out.println(sum);		
	}

}
