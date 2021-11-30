package ch42;

public abstract class Material { // 직접 쓸일은 없기 때문에 abstract로 만듭니다.
	/*
	 * T가 사용할 여러 메서드들을 추상클래스 상위 클래스에서 미리선언을 해놓고
	 * 이것을 구현하도록 할 수도 있고 공통되는 기능을 구현해 놓을 수도 있다.
	 * extends T를 사용함으로써 써야하는 재료에 대해서 한정을 두고
	 * 어떤 클래스 기반에 한 것만 넣을 수 있다는 제약도 있다.
	 */
	
	public abstract void doPrinting();
}
