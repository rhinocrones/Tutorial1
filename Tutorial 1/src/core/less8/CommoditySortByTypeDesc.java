package core.less8;

import java.util.Comparator;

public class CommoditySortByTypeDesc implements Comparator<Commodity> {

	@Override
	public int compare(Commodity commodity1, Commodity commodity2) {
		return commodity2.getType().compareTo(commodity1.getType());
	}

}
