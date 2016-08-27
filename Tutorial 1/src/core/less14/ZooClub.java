package core.less14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ZooClub {

	private final Map<Person, List<Pet>> ZC = new HashMap<>();

	public void addPerson(String name, int age) {
		ZC.put(new Person(name, age), new ArrayList<>());
	}

	public void addPet(Person person, String name, String type) {
		List<Pet> pets = ZC.get(person);
		if (pets != null)
			pets.add(new Pet(name, type));
	}

	public Map<Person, List<Pet>> removePerson(String name, int age) {
		ZC.remove(new Person(name, age));
		return ZC;
	}

	public Map<Person, List<Pet>> removePersonPet(Person person) {
		Set<Entry<Person, List<Pet>>> set = ZC.entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			if (entry.getKey().equals(person)) {
				entry.getValue().clear();
			}
		}
		return ZC;
	}

	public Map<Person, List<Pet>> removePetInAllPersons(String name, String type) {
		Set<Entry<Person, List<Pet>>> set = ZC.entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			entry.getValue().removeIf((pet) -> pet.equals(new Pet(name, type)));
		}
		return ZC;
	}

	public void print() {
		ZC.forEach((key, value) -> printCars(key, value));
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

	public Map<Person, List<Pet>> getZC() {
		return ZC;
	}
}
