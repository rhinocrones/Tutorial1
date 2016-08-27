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
			System.out.println("¬вед≥ть ф≥рму виробника керма!");
			String sWProducer = sc.nextLine().toUpperCase();
			System.out.println("¬вед≥ть тип керма (sport/normal)!");
			String type = sc.nextLine().toUpperCase();
			if (!type.equals("SPORT") && !type.equals("NORMAL")) {
				System.out
						.println("¬и помилилис€ при ввод≥ типу керма, перезапуст≥ть програму!");
			}
			System.out.println("¬вед≥ть на€вн≥сть кнопок на керм≥(yes/no)!");
			String buttons = sc.nextLine().toUpperCase();
			System.out.println("¬вед≥ть розм≥р керма!");
			int steeringWheelSize = sc.nextInt();
			if (!type.equals("SPORT") && !type.equals("NORMAL")) {
				System.out
						.println("¬и помилилис€ при вибор≥ на€вност≥ кнопок на керм≥, перезапуст≥ть програму!");
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
					.println("¬вед≥ть розм≥р колеса з €ким будемо пор≥внювати!");
			int newSize = sc.nextInt();
			System.out
					.println("ѕереходимо до новоњ машини, €кою будемо зам≥н€ти т≥ в €ких колеса менш≥ того значенн€, що ми вище вказали!");
			System.out.println("¬вед≥ть ф≥рму виробника машини!");
			String carProducer = sc.next().toUpperCase();
			System.out.println("¬вед≥ть вагу машини!");
			int carWeight = sc.nextInt();
			System.out.println("¬вед≥ть сер≥йний номер новоњ машини!");
			String bodySerialNumber = sc.next().toUpperCase();
			System.out
					.println("¬вед≥ть тип кузова (SEDAN/COMBI/HARDTOP/LIFTBACK/SPIDER/PICKUP/LANDO/CABRIOLET)!");
			String bType = sc.next().toUpperCase();
			System.out.println("¬вед≥ть кол≥р автомоб≥л€!");
			String bodyColor = sc.next();
			System.out.println("¬вед≥ть розм≥р колес!");
			int wheelSize = sc.nextInt();
			System.out.println("¬вед≥ть тип колес(winter/summer)!");
			String season = sc.next().toUpperCase();
			System.out.println("¬вед≥ть тип керма (sport/normal)!");
			String sType = sc.next().toUpperCase();
			System.out.println("¬вед≥ть на€вн≥сть кнопок на керм≥(yes/no)!");
			String buttons1 = sc.next().toUpperCase();
			System.out.println("¬вед≥ть ф≥рму виробника керма!");
			String sWProducer1 = sc.next().toUpperCase();
			System.out.println("¬вед≥ть розм≥р керма!");
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
			System.out.println("¬вед≥ть будьласка м≥н≥мальний розм≥р колеса!");
			int from = sc.nextInt();
			System.out.println("¬вед≥ть будьласка максимальний розм≥р колеса!");
			int to = sc.nextInt();
			CarFinder.changeForWinter(cars, from, to);

			break;
		case 9:
			System.out.println("¬вед≥ть будьласка м≥н≥мальний розм≥р колеса!");
			int from1 = sc.nextInt();
			System.out.println("¬вед≥ть будьласка максимальний розм≥р колеса!");
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
