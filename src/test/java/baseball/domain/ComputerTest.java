package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @DisplayName("랜덤으로 생성되는 숫자의 크기는 3이여야 함")
    @Test
    void confirmSizeByRandomNumber() {
        //given
        List<Integer> randomNumbers;
        Computer computer = new Computer();

        //when
        randomNumbers = computer.getNumber();

        //then
        assertThat(randomNumbers.size()).isEqualTo(3);
    }

    @DisplayName("랜덤으로 생성되는 숫자는 모두 다른 숫자여야 함")
    @Test
    void confirmDifferentNumberByRandomNumber() {
        //given
        List<Integer> randomNumbers;
        Computer computer = new Computer();

        //when
        randomNumbers = computer.getNumber();
        Set<Integer> randomNumberSet = new HashSet<>(randomNumbers);

        //then
        assertThat(randomNumbers.size()).isEqualTo(randomNumberSet.size());
    }

    @DisplayName("랜덤으로 생성되는 숫자는 1부터 9사이의 숫자여야 함")
    @Test
    void confirmRangeByRandomNumber() {
        //given
        List<Integer> randomNumbers;
        Computer computer = new Computer();

        //when
        randomNumbers = computer.getNumber();

        //then
        assertThat(randomNumbers.stream().allMatch(number -> number > 0 && number < 9)).isTrue();
    }

}