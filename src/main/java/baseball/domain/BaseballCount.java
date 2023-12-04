package baseball.domain;

import java.util.List;

public class BaseballCount {

    private static final int DEFAULT_VALUE = 0;

    private int strike;
    private int ball;

    public BaseballCount(List<Integer> playerNumber, List<Integer> computerNumber) {
        countResult(playerNumber, computerNumber);
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    private void countResult(List<Integer> playerNumber, List<Integer> computerNumber) {
        for (int i = DEFAULT_VALUE; i < playerNumber.size(); i++) {
            if (playerNumber.get(i).equals(computerNumber.get(i))) {
                strike++;
                continue;
            }
            if (computerNumber.contains(playerNumber.get(i))) {
                ball++;
            }
        }
    }
}
