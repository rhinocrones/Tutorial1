package Testing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;

import org.junit.*;

import core.less6.hw.Body;
import core.less6.hw.BodyType;
import core.less6.hw.Car;
import core.less6.hw.CarFinder;
import core.less6.hw.SteeringWheel;
import core.less6.hw.SteeringWheelButtons;
import core.less6.hw.SteeringWheelType;
import core.less6.hw.TakeChoice;
import core.less6.hw.Wheel;
import core.less6.hw.WheelType;
import static org.junit.Assert.*;

public class TestCarAndCarFinder {

	@Test
	public void changeSW() {
		String expected = "FUSION";
		SteeringWheel steeringWheel = new SteeringWheel(
				SteeringWheelType.SPORT, SteeringWheelButtons.YES, "MOMO", 10);
		steeringWheel.changeSW("sport", expected);
		String actual = steeringWheel.getsWProducer();
		assertEquals("Спортивне кермо замінено, виробник ", expected, actual);
	}

	@Test
	public void changeSW1() {
		String expected = "MOMO";
		SteeringWheel steeringWheel = new SteeringWheel(
				SteeringWheelType.SPORT, SteeringWheelButtons.YES, "MOMO", 5);
		steeringWheel.changeSW("normal", "NEDFORSPEED");
		String actual = steeringWheel.getsWProducer();
		assertEquals("Невдалося замінити кермо", expected, actual);
	}

	@Test
	public void changeWheel() {
		int expected = 20;
		Wheel wheel = new Wheel(15, WheelType.SUMMER);
		wheel.changeWheel(20, "summer");
		int actual = wheel.getWheelSize();
		assertEquals("Замінено колесо, новий розмір: ", expected, actual);
	}

	@Test
	public void changeWheel1() {
		int expected = 14;
		Wheel wheel = new Wheel(14, WheelType.SUMMER);
		wheel.changeWheel(20, "summer");
		int actual = wheel.getWheelSize();
		assertEquals("Неможливо замінити колесо!!", expected, actual);
	}

	@Test
	public void changeWheel2() {
		int expected = 16;
		Wheel wheel = new Wheel(16, WheelType.SUMMER);
		wheel.changeWheel(20, "winter");
		int actual = wheel.getWheelSize();
		assertEquals("Неможливо замінити колесо!!", expected, actual);
	}

	@Test
	public void changeSerialNumber() {
		String expected = "BB777";
		Body body = new Body("AA7888", BodyType.COMBI, "red");
		body.changeSerialNumber("cabriolet", "BB");
		String actual = "BB777";
		assertEquals("Новий серійний номер: ", expected, actual);
	}

	@Test
	public void changeSerialNumber1() {
		String expected = "AA7888";
		Body body = new Body("AA7888", BodyType.COMBI, "red");
		body.changeSerialNumber("combi", "BB");
		String actual = body.getBodySerialNumber();
		assertEquals("Не вдалося змінити серійний номер!", expected, actual);
	}

	@Test
	public void carsReplacer() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.carReplacer(actual, 21, "DEFAULT", 0, "DEFAULT",
				BodyType.CABRIOLET, "DEFAULT", 0, WheelType.SUMMER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "DEFAULT",
				0);
		assertEquals(expected.size(), actual.size());
	}

	@Test
	public void carsReplacer1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.carReplacer(actual, 15, "DEFAULT", 0, "DEFAULT",
				BodyType.CABRIOLET, "DEFAULT", 0, WheelType.SUMMER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "DEFAULT",
				0);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void WheelSizeMoreThenZero() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.WheelSizeMoreThenZero(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void WheelSizeMoreThenZero1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red", 0,
				WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				0, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 0,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		String expected = "FIXED";
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.WheelSizeMoreThenZero(actual);
		assertEquals(expected, "FIXED");
	}

	@Test
	public void WheelSizePlusColor() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.WheelSizePlusColor(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void WheelSizePlusColor1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red", 0,
				WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				0, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 0,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.WheelSizePlusColor(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void WheelSizePlusColor2() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setBody(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		car1.setBody(null);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 18,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		car2.setBody(null);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.WheelSizePlusColor(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void WheelSizePlusColor3() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setBody(null);
		car.setWheel(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		car1.setBody(null);
		car1.setWheel(null);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 18,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		car2.setBody(null);
		car2.setWheel(null);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.WheelSizePlusColor(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void BodyRedReplaceSteeringWheel() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red", 0,
				WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				0, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 0,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.BodyRedReplaceSteeringWheel(actual, "DEFAULT",
				SteeringWheelType.SPORT, SteeringWheelButtons.YES, 10);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void BodyRedReplaceSteeringWheel1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red", 0,
				WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setBody(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				0, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		car.setBody(null);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 0,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		car.setBody(null);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.BodyRedReplaceSteeringWheel(actual, "DEFAULT",
				SteeringWheelType.SPORT, SteeringWheelButtons.YES, 10);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void BodyRedReplaceSteeringWheel2() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "white",
				0, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "white",
				0, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, "white",
				0, WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.BodyRedReplaceSteeringWheel(actual, "DEFAULT",
				SteeringWheelType.SPORT, SteeringWheelButtons.YES, 10);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void doubleResizeWheel() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.doubleResizeWheel(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void doubleResizeWheel1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setSteeringWheel(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		car1.setSteeringWheel(null);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		car2.setSteeringWheel(null);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.doubleResizeWheel(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void doubleResizeWheel2() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red", 0,
				WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				0, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 0,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.doubleResizeWheel(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void doubleResizeWheel3() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red", 0,
				WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setWheel(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				0, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		car1.setWheel(null);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 0,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		car2.setWheel(null);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.doubleResizeWheel(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void findCarsBody() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.findCarsBody(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void findCarsBody1() {
		Car car = new Car("LADA", 1800, 15, WheelType.WINTER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "MOMO", 11);
		Car car1 = new Car("LADA", 1800, 15, WheelType.WINTER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "MOMO", 11);
		Car car2 = new Car("LADA", 1800, 15, WheelType.WINTER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "MOMO", 11);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.findCarsBody(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void removeBodyColor() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, "red", 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>();
		CarFinder.removeBodyColor(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(0, actual.size());
	}

	@Test
	public void removeBodyColor1() {
		Car car = new Car("LADA", 1800, 15, WheelType.WINTER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "MOMO", 11);
		Car car1 = new Car("LADA", 1800, 15, WheelType.WINTER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "MOMO", 11);
		Car car2 = new Car("LADA", 1800, 15, WheelType.WINTER,
				SteeringWheelType.NORMAL, SteeringWheelButtons.YES, "MOMO", 11);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.removeBodyColor(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void removeBodyColor2() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "", 18,
				WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car1, car2));
		CarFinder.removeBodyColor(actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(2, actual.size());
	}

	@Test
	public void changeForWinter() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.changeForWinter(actual, 10, 20);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void changeForWinter1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setWheel(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.changeForWinter(actual, 10, 20);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void changeForWinter2() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.changeForWinter(actual, 10, 20);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}

	@Test
	public void deleteCarsGotBody() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList());
		CarFinder.deleteCarsGotBody(actual, 10, 21);
		assertTrue(expected.containsAll(actual));
		assertEquals(0, actual.size());
	}

	@Test
	public void deleteCarsGotBody1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setBody(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car));
		CarFinder.deleteCarsGotBody(actual, 10, 21);
		assertTrue(expected.containsAll(actual));
		assertEquals(1, actual.size());
	}

	@Test
	public void deleteCarsGotBody2() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setBody(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.deleteCarsGotBody(actual, 18, 20);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}
	

	@Test
	public void saveIndex() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Integer> carIndexes = new ArrayList<>();
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.saveIndex(carIndexes, actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}
	

	@Test
	public void saveIndex1() {
		Car car = new Car("ADUI", 2700, "AA7777", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.YES, "MOMO", 10);
		car.setBody(null);
		Car car1 = new Car("AUDI", 2700, "AA2577", BodyType.CABRIOLET, "red",
				18, WheelType.SUMMER, SteeringWheelType.SPORT,
				SteeringWheelButtons.YES, "MOMO", 5);
		Car car2 = new Car("PEGUOT", 2000, "AA3333", BodyType.COMBI, null, 20,
				WheelType.WINTER, SteeringWheelType.NORMAL,
				SteeringWheelButtons.NO, "FUSION", 7);
		List<Integer> carIndexes = new ArrayList<>();
		List<Car> actual = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		List<Car> expected = new ArrayList<Car>(Arrays.asList(car, car1, car2));
		CarFinder.saveIndex(carIndexes, actual);
		assertTrue(expected.containsAll(actual));
		assertEquals(3, actual.size());
	}
}
