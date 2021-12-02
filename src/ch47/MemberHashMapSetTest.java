package ch47;

import java.util.HashMap;

public class MemberHashMapSetTest {

	public static void main(String[] args) {
				
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLim = new Member(1001, "Lim");
		Member memberWoo = new Member(1002, "Woo");
		Member memberAnna = new Member(1003, "Anna");
		Member memberKim = new Member(1004, "Kim");
		Member memberHong = new Member(1005, "Hong");
		
		memberHashMap.addMember(memberLim);
		memberHashMap.addMember(memberWoo);
		memberHashMap.addMember(memberAnna);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember(); 
		
		System.out.println();
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1001, "1");
		hashMap.put(1002, "2");
		hashMap.put(1003, "3");
		hashMap.put(1004, "4");
		
		System.out.println(hashMap);
		
	}

}
