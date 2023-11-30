package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseballCountTest {

    @DisplayName("같은 수가 같은 자리에 있을 경우 스트라이크")
    @Test
    void confirmStrikeByCompareNumber() {
        //given
        List<Integer> playerNumbers = Arrays.asList(1, 2, 3);
        List<Integer> computerNumbers = Arrays.asList(1, 3, 2);

        //when
        BaseballCount baseballCount = new BaseballCount(playerNumbers, computerNumbers);

        //then
        assertThat(baseballCount.getStrike()).isEqualTo(1);
    }

    @DisplayName("같은 수가 다른 자리에 있을 경우 볼")
    @Test
    void confirmBallByCompareNumber() {
        //given
        List<Integer> playerNumbers = Arrays.asList(1, 2, 3);
        List<Integer> computerNumbers = Arrays.asList(1, 3, 2);

        //when
        BaseballCount baseballCount = new BaseballCount(playerNumbers, computerNumbers);

        //then
        assertThat(baseballCount.getBall()).isEqualTo(2);
    }

    @DisplayName("같은 수가 없을 경우 낫싱")
    @Test
    void confirmNothingByCompareNumber() {
        //given
        List<Integer> playerNumbers = Arrays.asList(1, 2, 3);
        List<Integer> computerNumbers = Arrays.asList(4, 5, 6);

        //when
        BaseballCount baseballCount = new BaseballCount(playerNumbers, computerNumbers);

        //then
        assertThat(baseballCount.getStrike()).isEqualTo(0);
        assertThat(baseballCount.getBall()).isEqualTo(0);
        assertThat(baseballCount.getNothing()).isTrue();
    }

    @DisplayName("모든 수를 맞출 경우 3스트라이크")
    @Test
    void confirmThreeStrikeByCompareNumber() {
        //given
        List<Integer> playerNumbers = Arrays.asList(1, 2, 3);
        List<Integer> computerNumbers = Arrays.asList(1, 2, 3);

        //when
        BaseballCount baseballCount = new BaseballCount(playerNumbers, computerNumbers);

        //then
        assertThat(baseballCount.getStrike()).isEqualTo(3);
        assertThat(baseballCount.getBall()).isEqualTo(0);
        assertThat(baseballCount.getNothing()).isFalse();
    }

    @DisplayName("1개의 숫자가 자리까지 일치하고 2개의 숫자는 자리만 다른 경우 2볼 1스크라이크")
    @Test
    void confirmStrikeAndBallByCompareNumber() {
        //given
        List<Integer> playerNumbers = Arrays.asList(1, 2, 3);
        List<Integer> computerNumbers = Arrays.asList(1, 3, 2);

        //when
        BaseballCount baseballCount = new BaseballCount(playerNumbers, computerNumbers);

        //then
        assertThat(baseballCount.getStrike()).isEqualTo(1);
        assertThat(baseballCount.getBall()).isEqualTo(2);
        assertThat(baseballCount.getNothing()).isFalse();
    }
}