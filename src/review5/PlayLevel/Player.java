package review5.PlayLevel;

public class Player {
	private PlayerLevel level; // ������ ���� private�� ����
	
	public Player() { // �ʱ� ���� ����
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void play(int i) {
		level.go(i);
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level; // ���� level�� main���� ������ �����ڰ� upgradeLevel�޼��带 ȣ���ϰ� �Ű��������� �޾Ƽ� �� �������� �����Ѵ�.
		level.showLevelMessage();
	}
}
