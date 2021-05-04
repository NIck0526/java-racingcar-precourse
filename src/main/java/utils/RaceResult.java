package utils;

import racingcar.Cars;

import java.util.Arrays;
import java.util.List;

public class RaceResult {

    private Cars cars;
    private String winner = "";
    private List<Integer> winnerList ;
    private int max;

    public RaceResult(Cars cars) {
        this.cars = cars;
        this.winnerList = Arrays.asList(0);
    }

    public String getWinner() {
        return winner;
    }
    public void raceResult(){
        max = cars.getCars().get(0).getLocation();
        for (int i = 1; i < cars.getCars().size(); i++) {
            System.out.println(i);
            System.out.println(max);
            max =changeRank(i, max);
        }
        for (int i = 0; i < winnerList.size(); i++) {
            winner += cars.getCars().get(winnerList.get(i)).getName();
        }
    }

    private int changeRank(int index, int max) {
        if (max < cars.getCars().get(index).getLocation()) {
            winnerList = Arrays.asList(index);
            return cars.getCars().get(index).getLocation();
        }
        if (max == cars.getCars().get(index).getLocation()) {
            winnerList.add(index);
        }
        return cars.getCars().get(index).getLocation();
    }
}
