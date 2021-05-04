package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp(){
        cars = new Cars(Arrays.asList("BMW","AUDI","BENZ"));

    }

    @DisplayName("n대 생성 후 전진 또는 멈춤 구현")
    @Test
    void race(){
        //given
        int[] gasArr = {3, 5, 4};

        //when
        cars.getCars().get(0).putGas(gasArr[0]);
        cars.getCars().get(1).putGas(gasArr[1]);
        cars.getCars().get(2).putGas(gasArr[2]);

        //then
        assertThat(cars.getCars().get(0).getLocation()).isEqualTo(0);
        assertThat(cars.getCars().get(1).getLocation()).isEqualTo(1);
        assertThat(cars.getCars().get(2).getLocation()).isEqualTo(1);
    }
}
