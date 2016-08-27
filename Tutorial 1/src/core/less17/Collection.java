package core.less17;

import java.util.Arrays;

public class Collection {

	private Object[] objects;

	public Collection(Object[] objects) {
		this.objects = objects;
	}

	public class First implements Iterator {

		@Override
		public void next() {
		}

		@Override
		public void hasNext() {
		}

	}

	public class Second implements Iterator {

		@Override
		public void next() {
		}

		@Override
		public void hasNext() {

		}

	}

	public Object[] getObjects() {
		return objects;
	}

	public void setObjects(Object[] objects) {
		this.objects = objects;
	}

	@Override
	public String toString() {
		return "Collection [objects=" + Arrays.toString(objects) + "]";
	}

}
