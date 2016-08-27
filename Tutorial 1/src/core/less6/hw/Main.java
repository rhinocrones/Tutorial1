package core.less6.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Car car = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
                18, WheelType.SUMMER, SteeringWheelType.SPORT,
                SteeringWheelButtons.YES, "MOMO", 5);
        Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
                WheelType.WINTER, SteeringWheelType.NORMAL,
                SteeringWheelButtons.NO, "FUSION", 7);
        Car car3 = new Car("FORD", 3000, "AA3555", BodyType.HARDTOP, "red", 16,
                WheelType.SUMMER, SteeringWheelType.SPORT,
                SteeringWheelButtons.NO, "MOMO", 10);
        Car car4 = new Car("MERCEDES", 3000, "AB7788", BodyType.COMBI, "red",
                0, WheelType.WINTER, SteeringWheelType.SPORT,
                SteeringWheelButtons.YES, "FUSION", 2);
        Car car5 = new Car("LADA", 1800, 15, WheelType.WINTER,
                SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "MOMO", 11);
        Car car6 = new Car("AUDI", 2200, "AA5555", BodyType.CABRIOLET, "red",
                0, WheelType.SUMMER);
 
       
        List<Car> cars = new ArrayList<>();
        List<Integer> carIndexes = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        Scanner sc = new Scanner(System.in);
        System.out
                .println("Введіть 1, якщо: Знайти машини, які мають введений діаметр коліс.");
        System.out
                .println("Введіть 2, якщо: Знайти машини, які мають введений діаметр коліс та колір кузова.");
        System.out
                .println("Введіть 3, якщо: Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше.");
        System.out
                .println("Введіть 4, якщо: Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.");
        System.out
                .println("Введіть 5, якщо: Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.");
        System.out
                .println("Введіть 6, якщо: Знайти машини, які використовують введений тип кузова.");
        System.out
                .println("Введіть 7, якщо: Видалити з ліста усі машини, які мають введений колір кузова.");
        System.out
                .println("Введіть 8, якщо: Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові.");
        System.out
                .println("Введіть 9, якщо: Видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма");
        System.out
                .println("Введіть 10, якщо: Запам'ятати індекси машин, які мають введений тип кузова.");
        int choice = sc.nextInt();
        TakeChoice.takeChoice(choice, cars, carIndexes);
        System.out.println();
    }
}

