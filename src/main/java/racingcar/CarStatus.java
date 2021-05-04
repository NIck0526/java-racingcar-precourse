package racingcar;

public enum CarStatus {
    STOP, GO;

    public boolean isGO() {
        return this == GO;
    }

    public boolean isSTOP() {
        return this == STOP;
    }
}
