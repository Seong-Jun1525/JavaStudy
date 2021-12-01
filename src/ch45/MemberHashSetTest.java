package ch45;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLim = new Member(1001, "Lim");
		Member memberLee = new Member(1002, "Lee");
		Member memberWoo = new Member(1003, "Woo");
		Member memberKim = new Member(1004, "Kim");
		
		memberHashSet.addMember(memberLim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberWoo);
		memberHashSet.addMember(memberKim);
		
		Member memberHong = new Member(1004, "Hong");
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember(); 
		
	}

}
