package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {

    private List<Integer> number;

    public Player(int inputValue) {
        List<Integer> numberCheck = new ArrayList<>();
        for (char digit : String.valueOf(inputValue).toCharArray()) {
            numberCheck.add(Character.getNumericValue(digit));
        }
        
        validateSize(numberCheck);
        validateRange(numberCheck);
        validateDuplication(numberCheck);
        number = new ArrayList<>(numberCheck);
    }

    public BaseballCount requestResult(BaseballGame baseballGame) {
        return baseballGame.startGame(number);
    }

    private void validateSize(List<Integer> numberCheck) throws IllegalArgumentException {
        if (numberCheck.size() > 3) {
            throw new IllegalArgumentException();
        }
    }

    private void validateRange(List<Integer> numberCheck) throws IllegalArgumentException {
        for (int number : numberCheck) {
            if (number < 0 || number > 9) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateDuplication(List<Integer> numberCheck) throws IllegalArgumentException {
        Set<Integer> duplicationCheck = new HashSet<>(numberCheck);
        if (numberCheck.size() != duplicationCheck.size()) {
            throw new IllegalArgumentException();
        }
    }
}
