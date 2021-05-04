package racingcar;

public class Car {

    private final CarName carName;

    private int location;

    public Car(String name) {
        this.carName = new CarName(name);
        this.location = 0;
    }

    public CarStatus putGas(int  gas) {
        if (move(gas)) {
            this.location++;
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }

    private boolean move(int gas) {
        return 4 <= gas;
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getLocation() {
        return location;
    }
}
