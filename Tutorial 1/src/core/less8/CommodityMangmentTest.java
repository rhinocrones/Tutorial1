package core.less8;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CommodityMangmentTest {
	private static final CommodityManagment CM = new CommodityManagment();

	@Before
	public void setUp() {
		System.out.println("Created");
		CM.addCommodity("Cheese", 50, "Food", "YES");
		CM.addCommodity("Meat", 70, "Food", "NO");
		CM.addCommodity("Egg", 45, "Food", "YES");
		CM.addCommodity("GTA 5", 15, "Game", "NO");
		CM.addCommodity("Nike Roshe Run One NM", 700, "Clothes", "YES");
	}

	@After
	public void tearDown() {
		System.out.println("Cleared");
		CM.getCommodities().clear();
	}

	@Test
	public void filterDiscount() {
		CM.filterDiscount("Yes");
		int actual = CM.getCommodities().size();
		assertTrue(CM.getCommodities().contains(new Commodity("Cheese", 50, "Food", Sale.YES)));
		assertTrue(CM.getCommodities().contains(new Commodity("Egg", 45, "Food", Sale.YES)));
		assertTrue(CM.getCommodities().contains(new Commodity("Nike Roshe Run One NM", 700, "Clothes", Sale.YES)));
		assertEquals(3, actual);
	}

	@Test
	public void changeCommodity() {
		CM.changeCommodity(0, "DEFAULT", 0, "DEFAULT", "NO");
		Commodity actual = CM.getCommodities().get(0);
		Commodity expected = new Commodity("DEFAULT", 0, "DEFAULT", Sale.NO);
		assertTrue(expected.equals(actual));
		assertEquals(5, 5);
	}

	@Test
	public void sortByNameAsc() {
		List<Commodity> expected = new ArrayList<>();
		expected.add(new Commodity("Cheese", 50, "Food", Sale.YES));
		expected.add(new Commodity("Egg", 45, "Food", Sale.YES));
		expected.add(new Commodity("GTA 5", 15, "Game", Sale.NO));
		expected.add(new Commodity("Meat", 70, "Food", Sale.NO));
		expected.add(new Commodity("Nike Roshe Run One NM", 700, "Clothes",
				Sale.YES));
		CM.sortByNameAsc();
		List<Commodity> actual = CM.getCommodities();
		assertEquals(expected, actual);
	}

	@Test
	public void sortByPriceAsc() {
		List<Commodity> expected = new ArrayList<>();
		expected.add(new Commodity("GTA 5", 15, "Game", Sale.NO));
		expected.add(new Commodity("Egg", 45, "Food", Sale.YES));
		expected.add(new Commodity("Cheese", 50, "Food", Sale.YES));
		expected.add(new Commodity("Meat", 70, "Food", Sale.NO));
		expected.add(new Commodity("Nike Roshe Run One NM", 700, "Clothes",
				Sale.YES));
		CM.sortByPriceAsc();
		List<Commodity> actual = CM.getCommodities();
		assertEquals(expected, actual);
	}

	@Test
	public void sortBySaleAsc() {
		List<Commodity> expected = new ArrayList<>();
		expected.add(new Commodity("Meat", 70, "Food", Sale.NO));
		expected.add(new Commodity("GTA 5", 15, "Game", Sale.NO));
		expected.add(new Commodity("Cheese", 50, "Food", Sale.YES));
		expected.add(new Commodity("Egg", 45, "Food", Sale.YES));
		expected.add(new Commodity("Nike Roshe Run One NM", 700, "Clothes",
				Sale.YES));
		CM.sortBySaleAsc();
		List<Commodity> actual = CM.getCommodities();
		assertEquals(expected, actual);
	}

	@Test
	public void sortByTypeAsc() {
		List<Commodity> expected = new ArrayList<>();
		expected.add(new Commodity("Nike Roshe Run One NM", 700, "Clothes",
				Sale.YES));
		expected.add(new Commodity("Cheese", 50, "Food", Sale.YES));
		expected.add(new Commodity("Meat", 70, "Food", Sale.NO));
		expected.add(new Commodity("Egg", 45, "Food", Sale.YES));
		expected.add(new Commodity("GTA 5", 15, "Game", Sale.NO));
		CM.sortByTypeAsc();
		List<Commodity> actual = CM.getCommodities();
		assertEquals(expected, actual);
	}

	@Test
	public void sortByNameDesc() {
		CM.sortByNameDesc();
		List<Commodity> actual = CM.getCommodities();
		Commodity first = actual.get(0);
		for (int i = 0; i < actual.size(); i++) {
			assertTrue(descName(first, actual.get(i)));
			first = actual.get(i);
		}
	}

	private final boolean descName(Commodity first, Commodity second) {
		return first.getName().compareTo(second.getName()) >= 0;
	}

	@Test
	public void sortByPriceDesc() {
		CM.sortByPriceDesc();
		List<Commodity> actual = CM.getCommodities();
		Commodity first = actual.get(0);
		for (int i = 0; i < actual.size(); i++) {
			assertTrue(descPrice(first, actual.get(i)));
			first = actual.get(i);
		}
	}

	private final boolean descPrice(Commodity first, Commodity second) {
		return first.getPrice() - second.getPrice() >= 0;
	}

	@Test
	public void sortBySale() {
		CM.sortBySaleDesc();
		List<Commodity> actual = CM.getCommodities();
		Commodity first = actual.get(0);
		for (int i = 0; i < actual.size(); i++) {
			assertTrue(descSale(first, actual.get(i)));
			first = actual.get(i);
		}
	}

	private final boolean descSale(Commodity first, Commodity second) {
		return first.getSale().name().compareTo(second.getSale().name()) >= 0;
	}

	@Test
	public void sortByTypeDesc() {
		CM.sortByTypeDesc();
		List<Commodity> actual = CM.getCommodities();
		Commodity first = actual.get(0);
		for (int i = 0; i < actual.size(); i++) {
			assertTrue(descType(first, actual.get(i)));
			first = actual.get(i);
		}
	}

	private final boolean descType(Commodity first, Commodity second) {
		return first.getType().compareTo(second.getType()) >= 0;
	}
}
