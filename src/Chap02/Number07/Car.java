package Chap02.Number07;

public class Car {

    private static int totalCars;
    private String name;

    public Car(String name) {
        System.out.println("차량 구입, 이름 :" + name);
        this.name = name;
        totalCars++;
    }
}
