package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {


    private List<Car> cars;

    public Cars(List<String> names) {
        this.cars =  mapCar(names);
    }

    public List<Car> getCars() {
        return cars;
    }

    private static List<Car> mapCar(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            cars.add(new Car(names.get(i)));
        }
        return cars;
    }

    public void race() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).putGas((int) (Math.random() *10));
        }
    }

}
