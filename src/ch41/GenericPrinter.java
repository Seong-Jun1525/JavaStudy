package ch41;

public class GenericPrinter<T> {  // T�ڸ��� ���������� ����� �ڷ����� ����. ���߿� �� ��
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