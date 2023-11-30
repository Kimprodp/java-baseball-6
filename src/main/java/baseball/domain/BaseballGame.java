package baseball.domain;

import java.util.List;

public class BaseballGame {

    public static final int MAX_NUMBER_SIZE = 3;
    public static final int MIN_NUMBER_RANGE = 1;
    public static final int MAX_NUMBER_RANGE = 9;

    public BaseballCount startGame(List<Integer> playerNumber) {
        Computer computer = new Computer();
        return new BaseballCount(playerNumber, computer.getNumber());
    }

}
