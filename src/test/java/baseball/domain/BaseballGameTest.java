package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseballGameTest {

    @DisplayName("게임을 실행하면 게임 결과를 반환함")
    @Test
    void confirmGameResultByStartGame() {
        //given
        List<Integer> playerNumber = Arrays.asList(1, 2, 3);
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.setNewGame();
        baseballGame.setPlayer(playerNumber);

        //when, then
        assertThat(baseballGame.runGame()).isExactlyInstanceOf(BaseballCount.class);
    }
}