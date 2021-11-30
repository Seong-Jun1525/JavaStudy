package ch41;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // <> : 다이아몬드 연산자
		powderPrinter.setMeterial(powder);
		
		Powder p = powderPrinter.getMaterial(); // 형변환을 하지 않는다.
		// 형변환을 하지 않는 이유 : GenericPrinter<Powder>이렇게 작성하면 컴파일될 때 GenericPrinter 클래스에 있는 모든 T가 Powder로 바뀜.
		
		System.out.println(powderPrinter.toString());
		
	}

}
