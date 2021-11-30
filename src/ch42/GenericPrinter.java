package ch42;

public class GenericPrinter<T extends Material> {  // T자리에 실제적으로 사용할 자료형을 쓴다. 나중에 쓸 때
	private T material;
	
	public void setMeterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
