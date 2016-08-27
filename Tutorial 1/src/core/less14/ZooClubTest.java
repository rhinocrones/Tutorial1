package core.less14;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZooClubTest {

	private final static ZooClub ZC = new ZooClub();

	@Before
	public void setUp() {
		ZC.addPerson("Ivan", 20);
		ZC.addPet(new Person("Ivan", 20), "Bobo", "Dog");
		ZC.addPet(new Person("Ivan", 20), "Bibi", "Cat");
		ZC.addPet(new Person("Ivan", 20), "Bubu", "Snake");
		ZC.addPerson("Petro", 25);
		ZC.addPet(new Person("Petro", 25), "Bubu", "Snake");
		ZC.addPet(new Person("Petro", 25), "Gogi", "Hach");
		ZC.addPerson("Volodymyr", 28);
	}

	@After
	public void tearDown() {
		ZC.getZC().clear();
	}

	@Test
	public void removePerson() {
		assertEquals(3, ZC.getZC().keySet().size());
		ZC.removePerson("Petro", 25);
		assertEquals(2, ZC.getZC().keySet().size());
	}

	@Test
	public void removePersonPet() {
		Collection<List<Pet>> petCol = ZC.getZC().values();
		List<Pet> pets = new ArrayList<>();
		for (List<Pet> list : petCol) {
			pets.addAll(list);
		}
		assertEquals(5, pets.size());
		ZC.removePersonPet(new Person("Petro", 25));
		Collection<List<Pet>> difPetCol = ZC.getZC().values();
		List<Pet> difPets = new ArrayList<>();
		for (List<Pet> list : difPetCol) {
			difPets.addAll(list);
		}
		assertEquals(3, difPets.size());
		assertNotEquals(pets, difPets);
		assertFalse(pets.contains(difPets));
	}
	
	@Test
	public void removePetInAllPersons(){
		Collection<List<Pet>> petCol = ZC.getZC().values();
		List<Pet> pets = new ArrayList<>();
		for (List<Pet> list : petCol) {
			pets.addAll(list);
		}
		assertEquals(5, pets.size());
		ZC.removePetInAllPersons("Bubu", "Snake");
		Collection<List<Pet>> difPetCol = ZC.getZC().values();
		List<Pet> difPets = new ArrayList<>();
		for (List<Pet> list : difPetCol) {
			difPets.addAll(list);
		}
		assertEquals(3, difPets.size());
		System.out.println();
		ZC.print();
	}
}
