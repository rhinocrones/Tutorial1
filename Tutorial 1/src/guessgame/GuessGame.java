package guessgame;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random()*10);
		System.out.println("Я загадую число від 0 до 9...");
		
		while (true) {
			System.out.println("Число яке потрібно вгадати, - " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Перший гравець думає, що це " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Другий гравець думає, що це " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Третій гравець думає, що це " + guessp3);
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if(p1isRight) {
				System.out.println("В нас є переможець!");
				System.out.println("Перший гравець вгадав!");
				System.out.println("Кінець гри.");
				break;
			} else if (p2isRight) {
				System.out.println("В нас є переможець!");
				System.out.println("Другий гравець вгадав!");
				System.out.println("Кінець гри.");
			}
			else if (p3isRight) {
				System.out.println("В нас є переможець!");
				System.out.println("Третій гравець вгадав!");
				System.out.println("Кінець гри.");
			} else {
				System.out.println("Гравці повинні попробувати ще раз.");
			}
		}
	}
}


