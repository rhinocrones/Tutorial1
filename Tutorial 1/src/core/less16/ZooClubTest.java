package core.less16;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZooClubTest {

	private final Saver SAVER = new Saver("dsdsd.vds");
	private final static ZooClub ZC = new ZooClub();
	private final static Summary SUMMARY = new Summary();

	@Before
	public void setUp() {
		ZC.addPerson("Ivan", 25);
		ZC.addPet(new Person("Ivan", 25), "Bobo", "Snake");
		ZC.addPet(new Person("Ivan", 25), "Woof", "Dog");
		ZC.addPet(new Person("Ivan", 25), "Moo", "Cow");
		ZC.addPerson("Petro", 18);
		ZC.addPet(new Person("Petro", 18), "Woof", "Dog");
		ZC.addPet(new Person("Petro", 18), "Mew", "Cat");
		ZC.addPerson("Sergiy", 17);
		ZC.addPet(new Person("Sergiy", 17), "Pew", "Dog");
		ZC.addPerson("Volodymyr", 15);
		ZC.addPet(new Person("Volodymyr", 15), "Pew", "Dog");
	}

	@After
	public void tearDown() {
		ZC.getMap().clear();
	}

	@Test
	public void removePerson() {
		assertEquals(4, ZC.getMap().keySet().size());
		ZC.removePerson(new Person("Volodymyr", 15));
		assertEquals(3, ZC.getMap().keySet().size());
	}

	@Test
	public void deleteEnteredPet() {
		Collection<List<Pet>> petCol = ZC.getMap().values();
		List<Pet> pets = new ArrayList<>();
		for (List<Pet> list : petCol) {
			pets.addAll(list);
		}
		assertEquals(7, pets.size());
		ZC.deleteEnteredPet("Woof", "Dog");
		Collection<List<Pet>> difCol = ZC.getMap().values();
		List<Pet> difpets = new ArrayList<>();
		for (List<Pet> diflist : difCol) {
			difpets.addAll(diflist);
		}
		assertEquals(5, difpets.size());
		assertFalse(difpets.contains(new Pet("Woof", "Dog")));
	}

	@Test
	public void deletePet() {
		Collection<List<Pet>> petCol = ZC.getMap().values();
		List<Pet> pets = new ArrayList<>();
		for (List<Pet> list : petCol) {
			pets.addAll(list);
		}
		assertEquals(7, pets.size());
		ZC.deletePet(new Person("Ivan", 25));
		Collection<List<Pet>> difCol = ZC.getMap().values();
		List<Pet> difpets = new ArrayList<>();
		for (List<Pet> diflist : difCol) {
			difpets.addAll(diflist);
		}
		assertEquals(4, difpets.size());
		List<Pet> ivanPets = new ArrayList<>();
		Set<Entry<Person, List<Pet>>> set = ZC.getMap().entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			if (entry.getKey().equals(new Person("Ivan", 25))) {
				ivanPets = entry.getValue();
			}
		}
		assertEquals(0, ivanPets.size());
		ZC.print();
	}

	@Test
	public void saverTest() {
		assertEquals(4, ZC.getMap().keySet().size());
		Collection<List<Pet>> petCol = ZC.getMap().values();
		List<Pet> pets = new ArrayList<>();
		for (List<Pet> list : petCol) {
			pets.addAll(list);
		}
		assertEquals(7, pets.size());
		File file = new File("dsdsd.vds");
		file.deleteOnExit();
		SAVER.save(ZC);
		ZooClub actual = SAVER.load();
		Collection<List<Pet>> difCol = actual.getMap().values();
		List<Pet> difpets = new ArrayList<>();
		for (List<Pet> diflist : difCol) {
			difpets.addAll(diflist);
		}
		assertEquals(7, difpets.size());
	}

	@Test
	public void saverTest1() {
		File file = new File("dsdsd.vds");
		file.delete();
		ZooClub actual = SAVER.load();
	}
	@Test
	public void summaryTest(){
		ZC.removePerson(new Person("Ivan", 25));
		ZC.removePerson(new Person("Petro", 18));
		ZC.removePerson(new Person("Sergiy", 17));
		File file = new File("ppp.txt");
		file.deleteOnExit();
		SUMMARY.create(ZC.getMap(), "ppp");
		List<String> actual = new ArrayList<>();
		Set<Entry<Person, List<Pet>>> set = ZC.getMap().entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			actual.add(entry.getKey()+" "+entry.getValue());
		}
		List<String> expected = new ArrayList<>();
		String ex = SUMMARY.read("ppp");
		expected.add(ex);
		assertEquals(expected, actual);
	}
}