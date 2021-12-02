package ch46;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public Member() {}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}

//	implements Comparable<Member> �� ���
//	@Override
//	public int compareTo(Member member) { // �ڱ� �ڽŰ� ��
//		if(this.memberId > member.memberId) {
//			return 1;
//		}
//		else if(this.memberId < member.memberId) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//		return (this.memberId - member.memberId); // ��������
//		return (this.memberId - member.memberId) * (-1); // ��������
//		
//	}
	
	@Override
	public int compare(Member m1, Member m2) { // �ڱ� �ڽŰ� �񱳴��� ��
		
		return (m1.memberId - m2.memberId);
	}
}
