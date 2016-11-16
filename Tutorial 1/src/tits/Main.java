package tits;

public class Main {

	public static void main(String[] args) {
		label:
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < 5; ++j) {
					if(i>2) break label;
					System.out.println(j);
				}
				System.out.println(" ");
			}
	}

}
