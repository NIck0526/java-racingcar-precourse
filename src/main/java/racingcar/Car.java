package racingcar;

public class Car {
    private final int randomNumber;
    private final int STANDARD_NUMBER = 4;

    public Car(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public CarStatus race(Car car) {
        if (car.move(randomNumber)) {
            return CarStatus.GO;
        }

        return CarStatus.STOP;
    }

    private boolean move(int randomNumber) {
        return this.randomNumber >= STANDARD_NUMBER;
    }
}
