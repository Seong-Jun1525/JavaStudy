package ch45;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { // 멤버 아이디가 매개변수와 일치하면
				hashSet.remove(member); // 해당 멤버 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
