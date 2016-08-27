package core.less8;

import java.util.Comparator;

public class CommoditySortByNameAsc implements Comparator<Commodity> {

	@Override
	public int compare(Commodity commodity1, Commodity commodity2) {
		return commodity1.getName().compareTo(commodity2.getName());
	}

}
