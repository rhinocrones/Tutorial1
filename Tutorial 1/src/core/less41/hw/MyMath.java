package core.less41.hw;

public class MyMath {
	
	public static final double E = 2.718281828459045;
	
	public static final double PI = 3.141592653589793;

	public static int min(int a, int b) {
		if (a < b || a == b) {
			return a;
		} else
			return b;
	}

	public static int max(int a, int b) {
		if (a < b || a == b) {
			return b;
		} else
			return a;
	}

	public static int abs(int a) {
		if (a > 0 && a == 0) {
			return a;
		} else {
			return -(a);
		}
	}
	
	public static int addExact(int a, int b){
		return a+b;
	}
}
