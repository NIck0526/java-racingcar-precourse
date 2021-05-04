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

    @BeforeEach
    void setUp(){
        gm = new GameManager();
        cars = new Cars(Arrays.asList("BMW","AUDI","BENZ"));

    }

    @DisplayName("사용자로부터 자동차 이름 입력 구현 및 자동차 생성")
    @Test
    void inputName(){
        //given
        List<Car> carList = cars.getCars();

        //when

        //then
        assertThat(carList.get(0).getName()).isEqualTo("BMW");
        assertThat(carList.get(1).getName()).isEqualTo("AUDI");
        assertThat(carList.get(2).getName()).isEqualTo("BENZ");
    }
    
    @DisplayName("random 값 주입 시 조건에 따른 race 기능 구현")
    @Test
    void race(){
        //given
        gm = new GameManager(3, cars);
        List<Car> carList = cars.getCars();

        //when
        gm.race();
        int maxLocation = carList.get(0).getLocation();
        int maxIndex = 0; 
        for (int i = 0; i < carList.size(); i++) {
            if (maxLocation > carList.get(i).getLocation()) {
                maxLocation = carList.get(i).getLocation();
                maxIndex = i;
            }    
        }
        
        //then
        assertThat(carList.get(0).getLocation()).isNotNull();
        assertThat(carList.get(1).getLocation()).isNotNull();
        assertThat(carList.get(2).getLocation()).isNotNull();
        assertThat(carList.get(maxIndex).getLocation()).isEqualTo(maxLocation);
    }


}
