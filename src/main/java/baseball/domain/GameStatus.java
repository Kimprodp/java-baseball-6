package baseball.domain;

import baseball.Exception.Validator;

public class GameStatus {

    public static final int GAME_RESTART = 1;
    public static final int GAME_END = 2;

    public boolean checkRestart(int number) {
        Validator.validateRestartNumber(number);
        return number == GAME_RESTART;
    }
}
