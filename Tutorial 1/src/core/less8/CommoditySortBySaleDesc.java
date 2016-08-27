package core.less8;

import java.util.Comparator;

public class CommoditySortBySaleDesc implements Comparator<Commodity> {

	@Override
	public int compare(Commodity commodity1, Commodity commodity2) {
		return commodity2.getSale().name()
				.compareTo(commodity1.getSale().name());
	}

}
