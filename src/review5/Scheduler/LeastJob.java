package review5.Scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ��Ⱑ ���� �������� ����մϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("��Ⱑ ���� �������� ����մϴ�.");
	}

}
