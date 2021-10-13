package ch06;

public class TypeCasting {

	public static void main(String[] args) {
		int iNum = 10;
		byte bNum = (byte)iNum;

		System.out.println(iNum);
		System.out.println(bNum);

		int iiNum = 255;
		byte bbNum = (byte)iiNum;

		System.out.println(iiNum);
		System.out.println(bbNum);
		
		double dNum = 1.2;
		float fNum = 0.9F;

		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);

		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
