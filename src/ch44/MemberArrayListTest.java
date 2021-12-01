package ch44;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLim = new Member(1001, "Lim");
		Member memberLee = new Member(1002, "Lee");
		Member memberWoo = new Member(1003, "Woo");
		Member memberKim = new Member(1004, "Kim");
		
		memberArrayList.addMember(memberLim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberWoo);
		memberArrayList.addMember(memberKim);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAllMember();
		
	}

}
