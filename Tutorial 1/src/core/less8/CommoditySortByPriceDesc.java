package core.less8;

import java.util.Comparator;

public class CommoditySortByPriceDesc implements Comparator<Commodity> {

	@Override
	public int compare(Commodity commodity1, Commodity commodity2) {
		return commodity2.getPrice() - commodity1.getPrice();
	}

}
