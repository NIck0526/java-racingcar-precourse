package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    private Car car;
    private int gas;

    @BeforeEach
    void setUp(){
        car = new Car("BMW");
        gas = 5;
    }

    @DisplayName("자동차의 전진 구현")
    @Test
    void go(){
        CarStatus carStatus = car.putGas(gas);
        assertThat(car.getCarName()).isEqualTo("BMW");
        assertThat(carStatus).isEqualTo(CarStatus.GO);
    }

    @DisplayName("자동차의 멈춤 구현")
    @Test
    void stop(){
        CarStatus carStatus = car.putGas(gas);
        assertThat(carStatus).isEqualTo(CarStatus.STOP);
    }

}
