package core.less8;

import java.util.Comparator;

public class CommoditySortByTypeAsc implements Comparator<Commodity> {

	@Override
	public int compare(Commodity commodity1, Commodity commodity2) {
		return commodity1.getType().compareTo(commodity2.getType());
	}

}
