package ch41;

public class ThreeDPrinter2 { // 클래스에 1, 2같은 숫자 사용하는거 별로 좋은거 아니지만 이것은 예제여서 상관 x
	private Plastic material;
	
	public void setMeterial(Plastic material) {
		this.material = material;
	}
	
	public Plastic getMaterial() {
		return material;
	}
}
