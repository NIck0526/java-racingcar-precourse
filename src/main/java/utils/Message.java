package utils;

public enum Message {

    SET_UP("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INVALID("올바른 입력값이 아닙니다. 다시 입력해주세요."),
    HOW_MANY("시도할 회수는 몇회인가요?"),
    RACE_RESULT("실행 결과"),
    FINISH("가 최종 우승했습니다.");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
