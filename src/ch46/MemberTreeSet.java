package ch46;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
//		treeSet = new TreeSet<>();
		treeSet = new TreeSet<Member>(new Member()); // Comparator를 사용할 때는 꼭 이 부분에 내가 어떤 것으로 구현을 했는지 대상을 넣어줘야 한다.
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) { // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { // 멤버 아이디가 매개변수와 일치하면
				treeSet.remove(member); // 해당 멤버 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
