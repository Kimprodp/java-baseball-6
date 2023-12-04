package baseball.Exception;

import baseball.domain.BaseballGame;
import baseball.domain.GameStatus;
import baseball.view.constants.Message;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {

    public static String validateInput(String inputValue) {
        validateEmpty(inputValue);
        validateInteger(inputValue);

        return inputValue;
    }

    public static List<Integer> validateGameNumber(List<Integer> number) {
        validateGameNumberSize(number);
        validateGameNumberRange(number);
        validateGameNumberDuplication(number);

        return number;
    }

    public static void validateRestartNumber(int inputValue) {
        if (inputValue != GameStatus.GAME_RESTART && inputValue != GameStatus.GAME_END) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateEmpty(String inputValue) {
        if (inputValue.isEmpty()) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_EMPTY.getMessage());
        }
    }

    private static void validateInteger(String inputValue) {
        try {
            Integer.parseInt(inputValue);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateGameNumberSize(List<Integer> number) {
        if (number.size() > BaseballGame.MAX_NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateGameNumberRange(List<Integer> number) {
        for (int value : number) {
            if (value < 1 || value > 9) {
                throw new IllegalArgumentException();
            }
        }
    }

    private static void validateGameNumberDuplication(List<Integer> number) {
        Set<Integer> numberCheck = new HashSet<>(number);
        if (numberCheck.size() != number.size()) {
            throw new IllegalArgumentException();
        }
    }
}
