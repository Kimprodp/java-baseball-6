package baseball.domain;

import java.util.List;

public class BaseballCount {

    private static final int DEFAULT_VALUE = 0;

    private int strike;
    private int ball;
    private boolean nothing;

    public BaseballCount(List<Integer> playerNumber, List<Integer> computerNumber) {
        countStrike(playerNumber, computerNumber);
        countBall(playerNumber, computerNumber);
        checkNothing();
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean getNothing() {
        return nothing;
    }

    private void countStrike(List<Integer> playerNumber, List<Integer> computerNumber) {
        for (int i = DEFAULT_VALUE; i < playerNumber.size(); i++) {
            if (playerNumber.get(i).equals(computerNumber.get(i))) {
                strike++;
            }
        }
    }

    private void countBall(List<Integer> playerNumber, List<Integer> computerNumber) {
        for (int i = DEFAULT_VALUE; i < playerNumber.size(); i++) {
            if (!playerNumber.get(i).equals(computerNumber.get(i)) && computerNumber.contains(playerNumber.get(i))) {
                ball++;
            }
        }
    }

    private void checkNothing() {
        if (strike == 0 && ball == 0) {
            nothing = true;
        }
    }
}
