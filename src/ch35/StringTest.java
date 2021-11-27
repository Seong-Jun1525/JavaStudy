package ch35;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		// String클래스를 new해서 생성하게되면 Character 배열안에 들어가게 됨.
		// final로 선언됨. 즉, 해당 String은 변할 수 없다.
		// 상수 값도 변할 수 없다.
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(java);
		
		System.out.println(System.identityHashCode(java));
	}

}
