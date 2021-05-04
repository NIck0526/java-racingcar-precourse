package racingcar;


public class CarName {

    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 5;

    private String name;

    public CarName(String name) {
        if (name.length() < 1 || name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }
}
