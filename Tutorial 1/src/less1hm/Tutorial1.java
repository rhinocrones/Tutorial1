package less1hm;

import java.util.Scanner;

public class Tutorial1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter password");
		int x = s.nextInt();
		System.out.println("you entered "+ x);
		s.close();
	}
}
