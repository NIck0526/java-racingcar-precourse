package utils;

import racingcar.Cars;

import java.util.*;

public class GameManager {

    private static final Scanner sc = new Scanner(System.in);

    private static Cars cars;
    private static int TRY_NUMBER;

    public GameManager() {
    }

    public GameManager(int number, Cars cars) {
        this.TRY_NUMBER = number;
        this.cars = cars;
    }

    public void setUp() {
        inputName();
        inputTryNumber();
    }

    public void race(){
        System.out.println(Message.RACE.getMessage());
        for (int i = 0; i < TRY_NUMBER; i++) {
            cars.race();
            report();
        }
    }

    private void report() {
        for (int i = 0; i < cars.getCars().size(); i++) {
            String distance = convertHyphen(cars.getCars().get(i).getLocation());
            System.out.println(cars.getCars().get(i).getName()+":"+distance);
        }
        System.out.println("");
    }

    private String convertHyphen(int location) {
        String distance = "";
        for (int i = 0; i < location; i++) {
            distance += "-";
        }
        return distance;
    }



    public void inputName(){
        String[] inputArr = sc.nextLine().split(",");
        try {
            cars = new Cars(addCarList(inputArr));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println(Message.SET_UP.getMessage());
            inputName();
        }
    }

    private List<String> addCarList(String[] inputArr) {
        return new ArrayList<>(Arrays.asList(inputArr));
    }

    public void inputTryNumber(){
        System.out.println(Message.HOW_MANY.getMessage());
        while (!sc.hasNextInt()) {
            sc.next();
            System.err.print(Message.HOW_MANY.getMessage());
        }
        TRY_NUMBER =sc.nextInt();
    }
}
