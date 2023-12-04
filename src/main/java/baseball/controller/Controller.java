package baseball.controller;

import baseball.Exception.ExceptionHandler;
import baseball.Exception.Validator;
import baseball.domain.BaseballCount;
import baseball.domain.BaseballGame;
import baseball.domain.GameStatus;
import baseball.view.InputReader;
import baseball.view.OutputWriter;
import baseball.view.constants.Message;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public void run() {
        OutputWriter.println(Message.GAME_START.getMessage());
        do {
            startGame();
        } while (checkReStart());
    }

    private void startGame() {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.setNewGame();
        BaseballCount baseballCount;

        do {
            setPlayer(baseballGame);
            baseballCount = baseballGame.runGame();
            printResult(baseballCount.getStrike(), baseballCount.getBall());
        } while (!baseballGame.checkWin());

        printWin(baseballCount.getStrike());
    }

    private void setPlayer(BaseballGame baseballGame) {
        OutputWriter.print(Message.GAME_INPUT_NUMBER.getMessage());
        ExceptionHandler.retryInputPlayerNumber(() -> baseballGame.setPlayer(inputPlayerNumber()));
    }

    private List<Integer> inputPlayerNumber() {
        String inputValue = Validator.validateInput(InputReader.readLine());
        return convertPlayerNumberInput(inputValue);
    }

    private List<Integer> convertPlayerNumberInput(String inputValue) {
        List<Integer> playerNumber = new ArrayList<>();
        for (char value : inputValue.toCharArray()) {
            playerNumber.add(Character.getNumericValue(value));
        }

        return playerNumber;
    }

    private void printResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            OutputWriter.println(Message.GAME_RESULT_NOTHING.getMessage());
        }
        if (strike != 0 && ball == 0) {
            OutputWriter.printFormat(Message.GAME_RESULT_ONLY_STRIKE.getMessage(), strike);
        }
        if (strike == 0 && ball != 0) {
            OutputWriter.printFormat(Message.GAME_RESULT_ONLY_BALL.getMessage(), ball);
        }
        if (strike != 0 && ball != 0) {
            OutputWriter.printFormat(Message.GAME_RESULT_BALL_STRIKE.getMessage(), ball, strike);
        }
    }

    private void printWin(int strike) {
        OutputWriter.printFormat(Message.GAME_WIN.getMessage(), strike);
    }

    private boolean checkReStart() {
        OutputWriter.println(Message.GAME_SET.getMessage());
        return ExceptionHandler.retryInputRestartSelect(this::requestGameStatus);
    }

    private boolean requestGameStatus() {
        GameStatus gameStatus = new GameStatus();
        String inputValue = Validator.validateInput(InputReader.readLine());
        return gameStatus.checkRestart(Integer.parseInt(inputValue));
    }
}
