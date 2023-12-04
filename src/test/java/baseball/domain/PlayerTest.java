package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import baseball.view.constants.Message;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @DisplayName("플레이어 숫자가 3자리가 아닐 경우 예외가 발생함")
    @Test
    void sizeExceptionByPlayerNumber() {
        //given
        List<Integer> playerNumber = Arrays.asList(1, 2, 3, 4);

        //when, then
        assertThatThrownBy(() -> new Player(playerNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Message.ERROR_GAME_NUMBER_SIZE.getMessage());
    }

    @DisplayName("플레이어 숫자가 1부터 9까지의 숫자가 아닐 경우 예외가 발생함")
    @Test
    void rangeExceptionByPlayerNumber() {
        //given
        List<Integer> playerNumber = Arrays.asList(1, 0, 3);

        //when, then
        assertThatThrownBy(() -> new Player(playerNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Message.ERROR_GAME_NUMBER_RANGE.getMessage());

    }

    @DisplayName("중복된 숫자가 있을 경우 예외가 발생함")
    @Test
    void duplicationExceptionByPlayerNumber() {
        //given
        List<Integer> playerNumber = Arrays.asList(1, 1, 2);

        //when, then
        assertThatThrownBy(() -> new Player(playerNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Message.ERROR_GAME_NUMBER_DUPLICATION.getMessage());
    }
}