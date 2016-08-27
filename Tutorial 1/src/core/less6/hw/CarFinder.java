package core.less6.hw;

import java.util.Iterator;
import java.util.List;

public class CarFinder {

	public static void WheelSizeMoreThenZero(List<Car> list) {
		int cars = 0;
		for (Car car : list) {
			if (car.getWheelSize() > 0) {
				System.out.println(car);
				cars += 1;
			} else {
				System.out.println("FIXED");
			}
		}
		System.out.println("�������� " + cars
				+ " ����� �� ������� ����� ������!");
	}

	public static void WheelSizePlusColor(List<Car> list) {
		int cars = 0;
		for (Car car : list) {
			if (car.getWheel() != null && car.getBody() != null
					&& car.getWheelSize() > 0 && car.getBodyColor() != null) {
				System.out.println(car);
				cars += 1;
			}
		}
		System.out.println("�������� " + cars
				+ " ����� �� ������� ����� ������ �� ������� ���� ������!");
	}

	public static void BodyRedReplaceSteeringWheel(List<Car> list,
			String sWProducer, SteeringWheelType steeringWheelType,
			SteeringWheelButtons steeringWheelButtons, int steeringWheelSize) {
		int cars = 0;
		for (Car car : list) {
			if (car.getBody() != null && car.getBodyColor() != null
					&& car.getBodyColor().equalsIgnoreCase("red")) {
				cars += 1;
				System.out
						.println("�������� ������ � �������� �������  � �������� ������: "
								+ car);
				SteeringWheel steeringWheel = new SteeringWheel(
						steeringWheelType, steeringWheelButtons, sWProducer,
						steeringWheelSize);
				car.setSteeringWheel(steeringWheel);
				System.out.println("������ ���� ����� �����: " + car);
				list.set(list.indexOf(car), car);
			}
		}
		System.out
				.println("�������� "
						+ cars
						+ " ����� ��������� ������� �� �������� ����� ��������� ����� ��� ����������� ���� �����!");
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

	public static void doubleResizeWheel(List<Car> list) {
		int cars = 0;
		System.out.println();
		for (Car car : list) {
			if (car.getSteeringWheel() != null
					&& car.getSteeringWheel().getSteeringWheelButtons().name()
							.equals("yes".toUpperCase())
					&& car.getWheel() != null && car.getWheelSize() != 0) {
				cars += 1;
				System.out.println("�������� ������ � ������ � ����������: "
						+ car);
				car.setWheelSize(car.getWheelSize() * 2);
				list.set(list.indexOf(car), car);
				System.out.println("������ ���� ��������� ������� �����: "
						+ car);
			} else if (car.getSteeringWheel() != null
					&& car.getSteeringWheel().getSteeringWheelButtons().name()
							.equals("yes".toUpperCase())
					&& car.getWheel() != null && car.getWheelSize() == 0) {
				cars += 1;
				System.out.println("�������� ������ � ������ � ����������: "
						+ car);
				car.setWheelSize(20);
				list.set(list.indexOf(car), car);
				System.out.println("������ ���� ��������� ������� �����: "
						+ car);
				System.out
						.println("� ������ �� ������ ����� ��� ����, ������ ����������� 20");
			}
		}
		System.out.println("�������� " + cars
				+ " ����� � ������ ����������� �� �������� �� ������ ����!");
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

	public static void carReplacer(List<Car> list, int newSize,
			String carProducer, int carWeight, String bodySerialNumber,
			BodyType bodyType, String bodyColor, int wheelSize,
			WheelType wheelType, SteeringWheelType steeringWheelType,
			SteeringWheelButtons steeringWheelButtons, String sWProducer,
			int steeringWheelSize) {
		int cars = 0;
		for (Car car : list) {
			if (car.getWheelSize() < newSize) {
				cars += 1;
				System.out.println("�������� ������: " + car
						+ " �� ����� ����� ������ " + newSize);
				list.set(list.indexOf(car), car = new Car(carProducer,
						carWeight, bodySerialNumber, bodyType, bodyColor,
						wheelSize, wheelType, steeringWheelType,
						steeringWheelButtons, sWProducer, steeringWheelSize));
				System.out.println("������� �� ������: " + car);
			}
		}
		System.out.println("�������� " + cars + " �����, �� ���� �������!");
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

	public static void findCarsBody(List<Car> list) {
		int cars = 0;
		Iterator<Car> iterator = list.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getBody() != null) {
				cars += 1;
				System.out.println("������ � " + cars
						+ " ��� ����������� �������� ��� ������: " + car);
			}
		}
		System.out.println("�������� " + cars
				+ " �����, �� ����� �������� ��� ������!");
	}

	public static void removeBodyColor(List<Car> list) {
		int cars = 0;
		Iterator<Car> iterator = list.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getBody() != null && car.getBodyColor() != null
					&& !car.getBodyColor().isEmpty()) {
				cars += 1;
				System.out.println("�������� ������ � " + cars
						+ " ��� ���� ��������: " + car);
				iterator.remove();
			}
		}
		System.out.println("�������� " + cars + " �����!");
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

	public static void changeForWinter(List<Car> list, int from, int to) {
		int cars = 0;
		Iterator<Car> iterator = list.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getWheel() != null
					&& !((car.getWheelType().name()).equals("WINTER"))
					&& car.getWheelSize() < to && car.getWheelSize() > from) {
				cars += 1;
				System.out.println("�������� ������ � " + cars
						+ " � ��� �������� ��� ����� �� �����: " + car);
				car.setWheelType(WheelType.WINTER);
				list.set(list.indexOf(car), car);
				System.out.println("������ ���� ����� �����: " + car);
			}
		}
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

	public static void deleteCarsGotBody(List<Car> list, int from, int to) {
		int cars = 0;
		Iterator<Car> iterator = list.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getBody() != null && car.getWheelSize() < to
					&& car.getWheelSize() > from) {
				cars += 1;
				System.out.println("�������� ������ � " + cars
						+ " ��� ���� ��������: " + car);
				iterator.remove();
			}
		}
		System.out.println("�������� " + cars + " �����!");
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

	public static void saveIndex(List<Integer> integers, List<Car> list) {
		int cars = 0;
		Iterator<Car> iterator = list.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getBody() != null) {
				cars += 1;
				integers.add(list.indexOf(car));
			}
		}
		System.out.println("��������� " + cars + " ������� �����!");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

}
