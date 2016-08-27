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
                .println("������ 1, ����: ������ ������, �� ����� �������� ������ ����.");
        System.out
                .println("������ 2, ����: ������ ������, �� ����� �������� ������ ���� �� ���� ������.");
        System.out
                .println("������ 3, ����: ������� � ��� �������, �� ����� �������� ���� ������, ����� �� ����.");
        System.out
                .println("������ 4, ����: �������� ������ ���� �����, ���� ����� �� ��������.");
        System.out
                .println("������ 5, ����: ������� �� ������, �� ����� ������ �������� ����� �� ������� ��������, �� ���� ������.");
        System.out
                .println("������ 6, ����: ������ ������, �� �������������� �������� ��� ������.");
        System.out
                .println("������ 7, ����: �������� � ���� �� ������, �� ����� �������� ���� ������.");
        System.out
                .println("������ 8, ����: ������� ��� �������, ������ ���� ���� ������ � ��������� ������� ���� �� �����.");
        System.out
                .println("������ 9, ����: �������� �� ������, �� ����� �������� ��� ������ �� �������� ������� ������� �����");
        System.out
                .println("������ 10, ����: �����'����� ������� �����, �� ����� �������� ��� ������.");
        int choice = sc.nextInt();
        TakeChoice.takeChoice(choice, cars, carIndexes);
        System.out.println();
    }
}

