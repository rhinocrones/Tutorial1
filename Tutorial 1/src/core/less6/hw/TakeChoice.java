package core.less6.hw;

import java.util.List;
import java.util.Scanner;

public class TakeChoice {
	
	public static void takeChoice(int i, List<Car> cars,
			List<Integer> carIndexes) {
		Scanner sc = new Scanner(System.in);
		switch (i) {
		case 1:
			CarFinder.WheelSizeMoreThenZero(cars);

			break;
		case 2:
			CarFinder.WheelSizePlusColor(cars);

			break;
		case 3:
			System.out.println("������ ����� ��������� �����!");
			String sWProducer = sc.nextLine().toUpperCase();
			System.out.println("������ ��� ����� (sport/normal)!");
			String type = sc.nextLine().toUpperCase();
			if (!type.equals("SPORT") && !type.equals("NORMAL")) {
				System.out
						.println("�� ���������� ��� ���� ���� �����, ������������ ��������!");
			}
			System.out.println("������ �������� ������ �� ����(yes/no)!");
			String buttons = sc.nextLine().toUpperCase();
			System.out.println("������ ����� �����!");
			int steeringWheelSize = sc.nextInt();
			if (!type.equals("SPORT") && !type.equals("NORMAL")) {
				System.out
						.println("�� ���������� ��� ����� �������� ������ �� ����, ������������ ��������!");
			}
			CarFinder.BodyRedReplaceSteeringWheel(cars, sWProducer,
					SteeringWheelType.valueOf(type),
					SteeringWheelButtons.valueOf(buttons), steeringWheelSize);

			break;
		case 4:
			CarFinder.doubleResizeWheel(cars);

			break;
		case 5:
			System.out
					.println("������ ����� ������ � ���� ������ ����������!");
			int newSize = sc.nextInt();
			System.out
					.println("���������� �� ���� ������, ���� ������ ������� � � ���� ������ ����� ���� ��������, �� �� ���� �������!");
			System.out.println("������ ����� ��������� ������!");
			String carProducer = sc.next().toUpperCase();
			System.out.println("������ ���� ������!");
			int carWeight = sc.nextInt();
			System.out.println("������ ������� ����� ���� ������!");
			String bodySerialNumber = sc.next().toUpperCase();
			System.out
					.println("������ ��� ������ (SEDAN/COMBI/HARDTOP/LIFTBACK/SPIDER/PICKUP/LANDO/CABRIOLET)!");
			String bType = sc.next().toUpperCase();
			System.out.println("������ ���� ���������!");
			String bodyColor = sc.next();
			System.out.println("������ ����� �����!");
			int wheelSize = sc.nextInt();
			System.out.println("������ ��� �����(winter/summer)!");
			String season = sc.next().toUpperCase();
			System.out.println("������ ��� ����� (sport/normal)!");
			String sType = sc.next().toUpperCase();
			System.out.println("������ �������� ������ �� ����(yes/no)!");
			String buttons1 = sc.next().toUpperCase();
			System.out.println("������ ����� ��������� �����!");
			String sWProducer1 = sc.next().toUpperCase();
			System.out.println("������ ����� �����!");
			int steeringWheelSize1 = sc.nextInt();

			CarFinder.carReplacer(cars, newSize, carProducer, carWeight,
					bodySerialNumber, BodyType.valueOf(bType), bodyColor,
					wheelSize, WheelType.valueOf(season),
					SteeringWheelType.valueOf(sType),
					SteeringWheelButtons.valueOf(buttons1), sWProducer1,
					steeringWheelSize1);

			break;
		case 6:
			CarFinder.findCarsBody(cars);

			break;
		case 7:
			CarFinder.removeBodyColor(cars);

			break;
		case 8:
			System.out.println("������ ��������� ��������� ����� ������!");
			int from = sc.nextInt();
			System.out.println("������ ��������� ������������ ����� ������!");
			int to = sc.nextInt();
			CarFinder.changeForWinter(cars, from, to);

			break;
		case 9:
			System.out.println("������ ��������� ��������� ����� ������!");
			int from1 = sc.nextInt();
			System.out.println("������ ��������� ������������ ����� ������!");
			int to1 = sc.nextInt();
			CarFinder.deleteCarsGotBody(cars, from1, to1);

			break;
		case 10:
			CarFinder.saveIndex(carIndexes, cars);

			break;

		default:
			break;
		}
	}
}
