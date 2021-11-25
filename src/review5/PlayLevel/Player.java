package review5.PlayLevel;

public class Player {
	private PlayerLevel level; // 보안을 위해 private로 선언
	
	public Player() { // 초기 레벨 설정
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
		this.level = level; // 현재 level에 main에서 생성한 생성자가 upgradeLevel메서드를 호출하고 매개변수값을 받아서 그 변수값을 대입한다.
		level.showLevelMessage();
	}
}
