package baseball.domain;

import baseball.Exception.Validator;
import java.util.List;

public class Player {

    private List<Integer> number;

    public Player(List<Integer> number) {
        this.number = Validator.validateGameNumber(number);
    }

    public List<Integer> getNumber() {
        return number;
    }

}
