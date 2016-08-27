package core.less7;


import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	private static final Logic logic = new Logic();

	public static void main(String[] args) {

		boolean isRun = true;
		while(isRun){
			System.out.println("Enter 1 for add hero");
			System.out.println("Enter 2 for filter by age");
			System.out.println("Enter 3 for exit program");
			switch (sc.nextInt()) {
			case 1:
				addHero();
				break;

			case 2:
				filterByAge();
				break;
			case 3:
				isRun = false;
				break;
			}
		}
		System.out.println(logic.getSUPERHEROES());
	}
	public static void addHero() {
		System.out.println("Enter nickname");
		String nickname = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		logic.addHero(nickname, age);
	}

	public static void filterByAge() {
		System.out.println("Enter min age");
		int minAge = sc.nextInt();
		System.out.println("Enter max age");
		int maxAge = sc.nextInt();
		logic.filterByAge(minAge, maxAge);
	}

}
