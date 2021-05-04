package racingcar;

public class Car {

    private final CarName carName;

    private int location;

    public Car(String name) {
        this.carName = new CarName(name);
        this.location = 0;
    }

    public CarStatus putGas(int  gas) {
        System.out.println(this.getName()+" __ 주입 :: "+gas);
        if (move(gas)) {
            this.location++;
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }

    private boolean move(int gas) {
        return 4 <= gas;
    }

    public String getName() {
        return carName.getName();
    }

    public int getLocation() {
        return location;
    }
}
