package ch46;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);
	}
}

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		
		set.add("Lim");
		set.add("Woo");
		set.add("Kim");
		
		System.out.println(set); // [Kim, Lim, Woo]
				
//		MemberTreeSet memberTreeSet = new MemberTreeSet();
//		
//		Member memberLim = new Member(1001, "Lim");
//		Member memberWoo = new Member(1002, "Woo");
//		Member memberAnna = new Member(1003, "Anna");
//		Member memberKim = new Member(1004, "Kim");
//		Member memberHong = new Member(1005, "Hong");
//		
//		memberTreeSet.addMember(memberLim);
//		memberTreeSet.addMember(memberWoo);
//		memberTreeSet.addMember(memberAnna);
//		memberTreeSet.addMember(memberKim);
//		memberTreeSet.addMember(memberHong);
//		
//		memberTreeSet.showAllMember(); 
		
	}

}
