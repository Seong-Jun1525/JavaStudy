package ch35;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		// StringŬ������ new�ؼ� �����ϰԵǸ� Character �迭�ȿ� ���� ��.
		// final�� �����. ��, �ش� String�� ���� �� ����.
		// ��� ���� ���� �� ����.
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(java);
		
		System.out.println(System.identityHashCode(java));
	}

}
