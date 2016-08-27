 package core.less3.clas;

public class Main {

	public static void main(String[] args) {
		Human human = new Human(20, "Ivan");
		human.run();
		System.out.println(human.toString());
		Hunter hunter = new Hunter(18, "Petro");
		Hunter hunter1 = new Hunter(21, "Petro", 0);
		hunter1.eatMeat("chiken");
		hunter1.eatMeat();
		hunter1.run();
		System.out.println(hunter1.toString());
	}

}
