package utils;

import racingcar.Cars;

import java.util.*;

public class GameManager {

    private static final Scanner sc = new Scanner(System.in);

    private static Cars cars;
    private static int TRY_NUMBER;
    private static List<String> nameList;


    public void setUp() {
        inputName();
        inputTryNumber();
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
