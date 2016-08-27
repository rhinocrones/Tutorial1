package core.less8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommodityManagment {
	private final List<Commodity> commodities = new ArrayList<>();

	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void addCommodity(String name, int price, String type, String sale) {
		commodities.add(new Commodity(name, price, type, Sale.valueOf(sale
				.toUpperCase())));
	}

	public void filterDiscount(String discount) {
		commodities.removeIf((commodity) -> !commodity.getSale().name()
				.equals(discount.toUpperCase()));
	}

	public void changeCommodity(int index, String name, int price, String type,
			String sale) {
		commodities.set(
				index,
				new Commodity(name, price, type, Sale.valueOf(sale
						.toUpperCase())));
	}

	public void sortByNameAsc() {
		//commodities.sort(new CommoditySortByNameAsc());
		commodities.sort((f, s)->f.getName().compareTo(s.getName()));
	}

	public void sortByNameDesc() {
		//commodities.sort(new CommoditySortByNameDesc());
		commodities.sort((f,s)->s.getName().compareTo(f.getName()));
	}

	public void sortByPriceAsc() {
		//commodities.sort(new CommoditySortByPriceAsc());
		commodities.sort((f,s)->f.getPrice()-s.getPrice());
	}

	public void sortByPriceDesc() {
		//commodities.sort(new CommoditySortByPriceDesc());
		commodities.sort((f,s)->s.getPrice()-f.getPrice());
	}

	public void sortByTypeAsc() {
		//commodities.sort(new CommoditySortByTypeAsc());
		commodities.sort((f,s)->f.getType().compareTo(s.getType()));
	}

	public void sortByTypeDesc() {
		//commodities.sort(new CommoditySortByTypeDesc());
		commodities.sort((f,s)->s.getType().compareTo(f.getType()));
	}

	public void sortBySaleAsc() {
		//commodities.sort(new CommoditySortBySaleAsc());
		commodities.sort((f,s)->f.getSale().name().compareTo(s.getSale().name()));
	}

	public void sortBySaleDesc() {
		//commodities.sort(new CommoditySortBySaleDesc());
		commodities.sort((f,s)->s.getSale().name().compareTo(f.getSale().name()));
	}
}
