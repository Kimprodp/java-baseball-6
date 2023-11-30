# 도메인 모델

- Computer는 랜덤 숫자를 등록한다
- Player는 숫자 입력을 통해 BaseballGame에게 결과를 요청한다. (숫자 전달)
- BaseballGame은 Computer에게 랜덤 숫자를 요청한다.
- Computer는 BaseballGame에 대한 응답으로 랜덤 숫자를 알려준다.
- BaseballGame은 Player와 Computer의 숫자를 비교하여 BaseballCout를 생성한다.
- BaseballGame은 Player에 대한 응답으로 BaseballCount를 알려준다.

# 객체 분리

- Player
    - 입력된 숫자를 알고있다.
    - 숫자로 야구게임 결과를 요청한다.
- Computer
    - 랜덤 숫자를 알고있다.
    - 야구게임을 위해 숫자를 알려줘야 한다.
- BaseballGame
    - 두 숫자를 비교하여 야구게임 결과를 알려준다.
- BaseballCount
    - 스트라이크와 볼의 갯수를 알고있다.
    - 각 자리별 수 일치 여부에 따라 스트라이크와 볼을 계산한다.