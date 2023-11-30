package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @DisplayName("플레이어 숫자가 3자리가 아닐 경우 예외가 발생함")
    @Test
    void sizeExceptionByPlayerNumber() {
        //given
        int number = 1234;

        //when, then
        assertThatThrownBy(() -> new Player(number))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("플레이어 숫자가 0부터 9까지의 숫자가 아닐 경우 예외가 발생함")
    @Test
    void rangeExceptionByPlayerNumber() {
        //given
        int number = -124;

        //when, then
        assertThatThrownBy(() -> new Player(number))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("중복된 숫자가 있을 경우 예외가 발생함")
    @Test
    void duplicationExceptionByPlayerNumber() {
        //given
        int number = 112;

        //when, then
        assertThatThrownBy(() -> new Player(number))
                .isInstanceOf(IllegalArgumentException.class);
    }
}