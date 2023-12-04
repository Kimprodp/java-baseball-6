package baseball.view.constants;

public enum Message {

    /* Request */
    GAME_START("숫자 야구 게임을 시작합니다."),
    GAME_INPUT_NUMBER("숫자를 입력해주세요 : "),
    GAME_WIN("%d개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    GAME_SET("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),

    /* Response */
    GAME_RESULT_ONLY_BALL("%d볼"),
    GAME_RESULT_ONLY_STRIKE("%d스트라이크"),
    GAME_RESULT_BALL_STRIKE("%d볼 %d스트라이크"),
    GAME_RESULT_NOTHING("낫싱"),

    /* Error */
    ERROR_INPUT_EMPTY("[ERROR] 입력값이 없습니다.다시 입력해 주세요.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
