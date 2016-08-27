package core.less8;

import java.util.Comparator;

public class CommoditySortByPriceAsc implements Comparator<Commodity>{

	@Override
	public int compare(Commodity commodity1, Commodity commodity2) {
		return commodity1.getPrice()-commodity2.getPrice();
	}

}
