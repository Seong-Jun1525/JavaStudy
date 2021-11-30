package ch41;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMeterial(powder);
		
		Powder p = (Powder)printer.getMaterial(); // 이때 반환되는 값이 Object이기 때문에 앞에 (Powder)를 써줘서 형변환을 해야한다.
	}

}
