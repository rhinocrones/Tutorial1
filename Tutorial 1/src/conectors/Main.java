package conectors;

import java.sql.*;
import java.util.Scanner;

public class Main {
	private final static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		boolean isRun = true;
		while (isRun) {
			System.out.println();
			System.out.println("Enter 1 to start DB");
			System.out.println("Enter 2 to insert Products into DB");
			System.out.println("Enter 3 to insert User into DB");
			System.out.println("Enter 4 to make order");
			System.out.println("Enter 5 to exit");
			switch (SC.nextInt()) {
			case 1:
				MyDataBase.addTableProduct();
				MyDataBase.addTableCat();
				MyDataBase.addTableBrand();
				MyDataBase.addTableSize();
				MyDataBase.addFkForCategory();
				MyDataBase.addFkForBrand();
				MyDataBase.addFkForSize();
				MyDataBase.addTableUsr();
				MyDataBase.addTableRole();
				MyDataBase.addFkForRole();
				MyDataBase.addTableOrderProduct();
				MyDataBase.addFkForProduct();
				MyDataBase.addFkForUsr();
				break;
			case 2:
				MyDataBase.insertProductIntoDB("car", "AUDI", 2700, "S8",
						500.00);
				MyDataBase
						.insertProductIntoDB("car", "BMW", 2700, "X6", 500.00);
				MyDataBase.insertProductIntoDB("null", "null", 2700, "null",
						500.00);
				MyDataBase.insertProductIntoDB("null", "null", 2700, "null",
						500.00);
				MyDataBase
						.insertProductIntoDB("car", "LADA", 2000, "6", 500.00);
				break;
			case 3:
				MyDataBase.insertUserIntoDB("Vova", "Pedko", "blabla",
						"pokemon", "Admin");
				MyDataBase.insertUserIntoDB("Vova1", "Pedko1", "blabla",
						"pokemon", "User");
				break;
			case 4:
				MyDataBase.makeOrder("Vova", "X6");
				MyDataBase.readOrder();
				break;
			case 5:
				isRun = false;
			}

		}
	}

}
