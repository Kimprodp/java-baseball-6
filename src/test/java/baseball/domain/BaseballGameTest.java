package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseballGameTest {

    @DisplayName("플레이어 번호와 함께 게임을 요청하면 게임 결과를 반환함")
    @Test
    void confirmGameResultByPlayerNumber() {
        //given
        List<Integer> playerNumber = Arrays.asList(1, 2, 3);
        BaseballGame baseballGame = new BaseballGame();

        //when, then
        assertThat(baseballGame.startGame(playerNumber)).isExactlyInstanceOf(BaseballCount.class);
    }

}