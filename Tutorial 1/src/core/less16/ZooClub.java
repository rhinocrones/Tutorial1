package core.less16;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ZooClub implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3649666869499153752L;

	private final Map<Person, List<Pet>> zooClub = new HashMap<>();

	public void addPerson(String name, int age) {
		zooClub.put(new Person(name, age), new ArrayList<>());
	}

	public void addPet(Person person, String name, String type) {
		List<Pet> pets = zooClub.get(person);
		if (pets != null)
			pets.add(new Pet(name, type));
	}

	public Map<Person, List<Pet>> deletePet(Person person) {
		Set<Entry<Person, List<Pet>>> set = zooClub.entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			entry.getValue().removeIf((pet) -> entry.getKey().equals(person));
		}
		return zooClub;
	}

	public Map<Person, List<Pet>> removePerson(Person person) {
		zooClub.remove(person);
		return zooClub;
	}

	public Map<Person, List<Pet>> deleteEnteredPet(String name, String type) {
		Set<Entry<Person, List<Pet>>> set = zooClub.entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			entry.getValue().removeIf((pet) -> pet.equals(new Pet(name, type)));
		}
		return zooClub;
	}

	public void print() {
		zooClub.forEach((key, value) -> printCars(key, value));

	}

	public void printCars(Person person, List<Pet> pets) {
		int len = person.toString().length();
		System.out.print(person);
		if (!pets.isEmpty()) {
			System.out.println(pets.get(0));
		} else {
			System.out.println();
		}
		String space = "";
		for (int i = 0; i < len; i++) {
			space += " ";
		}
		for (int i = 1; i < pets.size(); i++) {
			System.out.println(space + pets.get(i));
		}
	}

	public Map<Person, List<Pet>> getMap() {
		return zooClub;
	}
}
