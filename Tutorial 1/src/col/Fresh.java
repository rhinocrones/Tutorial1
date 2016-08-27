package col;

import java.util.List;

public class Fresh {

	private Fruit fruit;

	private List<Fruit> juices;

	private List<Fruit> slices;

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public List<Fruit> getJuices() {
		return juices;
	}

	public void setJuices(List<Fruit> juices) {
		this.juices = juices;
	}

	public List<Fruit> getSlices() {
		return slices;
	}

	public void setSlices(List<Fruit> slices) {
		this.slices = slices;
	}

	public void addToJuices(String name) {
		juices.add(new Fruit(name));
	}

	public void addToSlices(String name) {
		slices.add(new Fruit(name));
	}

	public void makeFresh(List<Fruit> juices, List<Fruit> slices) {
		try {
			for (Fruit fruit : juices) {
				System.out.print(fruit);
				System.out.print(" ");
			}
			System.out.println();
			for (Fruit fruit : slices) {
				System.out.print(fruit);
				System.out.print(" ");
			}
		} catch (Exception e) {
		}
	}
}
