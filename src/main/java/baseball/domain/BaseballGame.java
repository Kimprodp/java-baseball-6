package baseball.domain;

import java.util.List;

public class BaseballGame {

    public static final int NUMBER_SIZE = 3;
    public static final int MIN_NUMBER_RANGE = 1;
    public static final int MAX_NUMBER_RANGE = 9;
    public static final int WIN_CRITERIA = 3;

    private Computer computer;
    private Player player;
    private BaseballCount baseballCount;

    public void setNewGame() {
        computer = new Computer();
    }

    public void setPlayer(List<Integer> number) {
        player = new Player(number);
    }

    public BaseballCount runGame() {
        return baseballCount = new BaseballCount(player.getNumber(), computer.getNumber());
    }

    public boolean checkWin() {
        return baseballCount.getStrike() == WIN_CRITERIA;
    }
}
