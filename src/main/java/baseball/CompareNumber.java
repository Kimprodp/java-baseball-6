package baseball;

import java.util.List;

public class CompareNumber {

	private int strike;
	private int ball;
	
	public CompareNumber() {
		this.strike = 0;
		this.ball = 0;
	}
	
	public void compare(List<Integer> computerNumber, List<Integer> playerNumber) {
		for (int i = 0; i < computerNumber.size(); i++) {
			if (computerNumber.get(i) == playerNumber.get(i)) {
				this.strike ++;
				continue;
			}
			if (computerNumber.contains(playerNumber.get(i))) {
				this.ball ++;
			}
		}
	}
	
	public int getStrike() {
		return this.strike;
	}
	
	public int getBall() {
		return this.ball;
	}
	
	public boolean threeStrike() {
		if (strike == 3) {
			return false;
		} return true;
	}
}
