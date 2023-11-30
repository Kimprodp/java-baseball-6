package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Integer> number;

    public Computer() {
        number = createRandomNumber();
    }

    public List<Integer> getNumber() {
        return number;
    }

    private List<Integer> createRandomNumber() {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < BaseballGame.MAX_NUMBER_SIZE) {
            int number = Randoms.pickNumberInRange(BaseballGame.MIN_NUMBER_RANGE, BaseballGame.MAX_NUMBER_RANGE);
            if (!randomNumbers.contains(number)) {
                randomNumbers.add(number);
            }
        }

        return randomNumbers;
    }
}
