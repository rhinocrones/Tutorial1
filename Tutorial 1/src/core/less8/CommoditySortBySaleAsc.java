package core.less8;

import java.util.Comparator;

public class CommoditySortBySaleAsc implements Comparator<Commodity> {

	@Override
	public int compare(Commodity commodity1, Commodity commodity2) {
		return commodity1.getSale().name()
				.compareTo(commodity2.getSale().name());
	}

}
