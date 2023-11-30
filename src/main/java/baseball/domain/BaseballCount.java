package baseball.domain;

import java.util.List;

public class BaseballCount {

    private static final int DEFAULT_VALUE = 0;

    private int strike;
    private int ball;
    private boolean nothing;

    public BaseballCount(List<Integer> playerNumber, List<Integer> computerNumber) {
        strike = countStrike(playerNumber, computerNumber);
        ball = countBall(playerNumber, computerNumber);
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

    private int countStrike(List<Integer> playerNumber, List<Integer> computerNumber) {
        int count = DEFAULT_VALUE;
        for (int i = DEFAULT_VALUE; i < playerNumber.size(); i++) {
            if (playerNumber.get(i).equals(computerNumber.get(i))) {
                count++;
            }
        }

        return count;
    }

    private int countBall(List<Integer> playerNumber, List<Integer> computerNumber) {
        int count = DEFAULT_VALUE;
        for (int i = DEFAULT_VALUE; i < playerNumber.size(); i++) {
            if (computerNumber.contains(playerNumber.get(i))) {
                count++;
            }
        }

        return count;
    }

    private boolean checkNothing() {
        boolean isNothing = true;
        if (strike != 0 && ball != 0) {
            isNothing = false;
        }

        return isNothing;
    }
}
