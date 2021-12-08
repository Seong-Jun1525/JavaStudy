package ch53;

public class StringConcatTest {

	public static void main(String[] args) {
//		// 람다식 이전에 클래스를 사용하는 방식
//		String s1 = "Hello";
//		String s2 = "World";
//		StringConCatImpl strImpl = new StringConCatImpl();
//		strImpl.makeString(s1, s2);
		
//		@FunctionalInterface을 StringConcat.java에 선언하고
		String s1 = "Hello";
		String s2 = "World";
		
		StringConCatImpl strImpl = new StringConCatImpl();
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		// 람다식을 이렇게 쓰게 되면 이게 아래 익명 클래스로 바뀐다 그렇기 때문에 메서드도 하나만 만들어야한다.
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
