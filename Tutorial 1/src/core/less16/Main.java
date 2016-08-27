package core.less16;

import java.util.Scanner;

public class Main {

	private final static Saver SAVER = new Saver("save.dsdsdsd");

	private final static Scanner SC = new Scanner(System.in);

	private final static ZooClub ZC = SAVER.load();

	private final static Summary SUMMARY = new Summary();

	public static void main(String[] args) {
		boolean isRun = true;
		while (isRun) {
			System.out.println("Enter 1 to add Person");
			System.out.println("Enter 2 to add Person Pet");
			System.out.println("Enter 3 delete Person Pet");
			System.out.println("Enter 4 to delete Person");
			System.out.println("Enter 5 to delete same Pets in all Persons");
			System.out.println("Enter 6 to show zooclub");
			System.out.println("Enter 7 to create summary");
			System.out.println("Enter 8 to read summary");
			System.out.println("Enter 0 to exit");
			switch (SC.nextInt()) {
			case 1:
				System.out.println("Enter name");
				System.out.println("Enter age");
				ZC.addPerson(SC.next(), SC.nextInt());
				SAVER.save(ZC);
				break;

			case 2:
				System.out.println("Enter person name");
				System.out.println("Enter person age");
				System.out.println("Enter pet name");
				System.out.println("Enter pet type");
				ZC.addPet(new Person(SC.next(), SC.nextInt()), SC.next(),
						SC.next());
				SAVER.save(ZC);
				break;
			case 3:
				System.out.println("Enter person name");
				System.out.println("Enter person age");
				ZC.deletePet(new Person(SC.next(), SC.nextInt()));
				SAVER.save(ZC);
				break;
			case 4:
				System.out.println("Enter person name");
				System.out.println("Enter person age");
				ZC.removePerson(new Person(SC.next(), SC.nextInt()));
				SAVER.save(ZC);
				break;
			case 5:
				System.out.println("Enter pet name");
				System.out.println("Enter pet type");
				ZC.deleteEnteredPet(SC.next(), SC.next());
				SAVER.save(ZC);
				break;
			case 6:
				ZC.print();
				break;
			case 7:
				System.out.println("Enter file name");
				SUMMARY.create(ZC.getMap(), SC.next());
				break;
			case 8:
				System.out.println("Enter file name");
				String fileName = SC.next();
				System.out.println(SUMMARY.read(fileName.toString()));
				break;
			case 0:
				SAVER.save(ZC);
				isRun = false;
			}
		}
	}
}