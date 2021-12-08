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
		
//		is. 코드 상 에러라고 뜨지는 않지만 출력했을 때 error가 생김. 왜냐면 한번 연산이 시행되고 나면 소모가 되기 떄문.
		
		int sum = Arrays.stream(arr).sum(); // 그렇기 때문에 또 다른 연산을 사용하기 위해서는 스트림을 다시 생성하여야 함.
		System.out.println(sum);		
	}

}
