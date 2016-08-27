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
		System.out.println("Знайдено " + cars
				+ " машин де введено розмір колеса!");
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
		System.out.println("Знайдено " + cars
				+ " машин де введено розмір колеса та введено колір кузова!");
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
						.println("Знайдено машину з червоним кузовом  і існуючим кермом: "
								+ car);
				SteeringWheel steeringWheel = new SteeringWheel(
						steeringWheelType, steeringWheelButtons, sWProducer,
						steeringWheelSize);
				car.setSteeringWheel(steeringWheel);
				System.out.println("Машина після заміни керма: " + car);
				list.set(list.indexOf(car), car);
			}
		}
		System.out
				.println("Знайдено "
						+ cars
						+ " машин червоного кольору та виконано заміну існуючого керма або встановлено нове кермо!");
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
				System.out.println("Знайдено машину з кермом з кнопочками: "
						+ car);
				car.setWheelSize(car.getWheelSize() * 2);
				list.set(list.indexOf(car), car);
				System.out.println("Машина після збільшення діаметра колес: "
						+ car);
			} else if (car.getSteeringWheel() != null
					&& car.getSteeringWheel().getSteeringWheelButtons().name()
							.equals("yes".toUpperCase())
					&& car.getWheel() != null && car.getWheelSize() == 0) {
				cars += 1;
				System.out.println("Знайдено машину з кермом з кнопочками: "
						+ car);
				car.setWheelSize(20);
				list.set(list.indexOf(car), car);
				System.out.println("Машина після збільшення діаметра колес: "
						+ car);
				System.out
						.println("У звязку що діаметр колес був нуль, діаметр встановлено 20");
			}
		}
		System.out.println("Знайдено " + cars
				+ " машин з кермом зкнопочками та збільшено їх діаметр коліс!");
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
				System.out.println("Знайдено машину: " + car
						+ " де розмір колес менший " + newSize);
				list.set(list.indexOf(car), car = new Car(carProducer,
						carWeight, bodySerialNumber, bodyType, bodyColor,
						wheelSize, wheelType, steeringWheelType,
						steeringWheelButtons, sWProducer, steeringWheelSize));
				System.out.println("Замінено на машину: " + car);
			}
		}
		System.out.println("Знайдено " + cars + " машин, які було замінено!");
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
				System.out.println("Машина № " + cars
						+ " яка використовує введений тип кузова: " + car);
			}
		}
		System.out.println("Знайдено " + cars
				+ " машин, які мають введений тип кузова!");
	}

	public static void removeBodyColor(List<Car> list) {
		int cars = 0;
		Iterator<Car> iterator = list.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getBody() != null && car.getBodyColor() != null
					&& !car.getBodyColor().isEmpty()) {
				cars += 1;
				System.out.println("Знайдено машину № " + cars
						+ " яку буде видалено: " + car);
				iterator.remove();
			}
		}
		System.out.println("Видалено " + cars + " машин!");
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
				System.out.println("Знайдено машину № " + cars
						+ " в якій зімниться тип колес на зимові: " + car);
				car.setWheelType(WheelType.WINTER);
				list.set(list.indexOf(car), car);
				System.out.println("Машина після заміни колес: " + car);
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
				System.out.println("Знайдено машину № " + cars
						+ " яку буде видалено: " + car);
				iterator.remove();
			}
		}
		System.out.println("Видалено " + cars + " машин!");
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
		System.out.println("Збережено " + cars + " індексів машин!");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		System.out.println();
		for (Car car : list) {
			System.out.println(car);
		}
	}

}
