package ch41;

public class ThreeDPrinter3 { // 클래스에 1, 2같은 숫자 사용하는거 별로 좋은거 아니지만 이것은 예제여서 상관 x
	// 이 printer는 재료가 뭐든지 다 적용
	
	private Object material;
	
	public void setMeterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
}
