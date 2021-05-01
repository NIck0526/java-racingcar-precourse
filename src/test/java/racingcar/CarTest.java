package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp(){
        car = new Car(5);
    }

    @Test
    void go(){
        CarStatus carStatus = car.race(car);
        assertThat(carStatus).isEqualTo(CarStatus.GO);
    }

    @Test
    void stop(){
        CarStatus carStatus = car.race(car);
        assertThat(carStatus).isEqualTo(CarStatus.STOP);
    }



}
