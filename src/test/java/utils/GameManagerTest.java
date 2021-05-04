package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Car;
import racingcar.Cars;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameManagerTest {

    private GameManager gm;
    private Cars cars;
    private RaceResult raceResult;

    @BeforeEach
    void setUp(){
        gm = new GameManager();
        cars = new Cars(Arrays.asList("BMW","AUDI","BENZ"));

    }

    @DisplayName("사용자로부터 자동차 이름 입력 구현 및 자동차 생성")
    @Test
    void inputName(){
        //given

        //when
        List<Car> carList = cars.getCars();

        //then
        assertThat(carList.get(0).getName()).isEqualTo("BMW");
        assertThat(carList.get(1).getName()).isEqualTo("AUDI");
        assertThat(carList.get(2).getName()).isEqualTo("BENZ");
    }

    @DisplayName("한 명 이상의 우승자 선출")
    @Test
    void getWinner(){
        //given
        int[] gasArr = {3, 5, 1};

        //when
        cars.getCars().get(0).putGas(gasArr[0]);
        cars.getCars().get(1).putGas(gasArr[1]);
        cars.getCars().get(2).putGas(gasArr[2]);
        raceResult = new RaceResult(cars);
        raceResult.raceResult();

        //then
        assertThat(raceResult.getWinner()).isEqualTo("AUDI");
    }

}
