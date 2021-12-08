package ch53;

public class StringConcatTest {

	public static void main(String[] args) {
//		// ���ٽ� ������ Ŭ������ ����ϴ� ���
//		String s1 = "Hello";
//		String s2 = "World";
//		StringConCatImpl strImpl = new StringConCatImpl();
//		strImpl.makeString(s1, s2);
		
//		@FunctionalInterface�� StringConcat.java�� �����ϰ�
		String s1 = "Hello";
		String s2 = "World";
		
		StringConCatImpl strImpl = new StringConCatImpl();
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		// ���ٽ��� �̷��� ���� �Ǹ� �̰� �Ʒ� �͸� Ŭ������ �ٲ�� �׷��� ������ �޼��嵵 �ϳ��� �������Ѵ�.
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "...." + s2);
			}
		};
		
		concat2.makeString(s1, s2);
	}

}
