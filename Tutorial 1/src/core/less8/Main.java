package core.less8;

import java.util.Scanner;

public class Main {

	private static final CommodityManagment CM = new CommodityManagment();

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isRun = true;
		boolean isRun1 = true;
		while (isRun) {
			System.out.println("Enter 1 to add commodity");
			System.out.println("Enter 2 to filter commodity by discount");
			System.out.println("Enter 3 to change commodity");
			System.out.println("Enter 4 to show all commoditys");
			System.out.println("Enter 5 to sort commodity");
			System.out.println("Enter 0 to exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter price");
				int price = sc.nextInt();
				System.out.println("Enter type");
				String type = sc.next();
				System.out.println("Enter discount (YES/NO)");
				String sale = sc.next();
				CM.addCommodity(name, price, type, sale);
				break;

			case 2:
				System.out.println("Commoditys (YES/NO) discount");
				String discount = sc.next();
				CM.filterDiscount(discount);
				break;
			case 3:
				System.out.println("Enter number of commodity (Start from 1)");
				int index = sc.nextInt() - 1;
				System.out.println("Enter name");
				String name1 = sc.next();
				System.out.println("Enter price");
				int price1 = sc.nextInt();
				System.out.println("Enter type");
				String type1 = sc.next();
				System.out.println("Enter discount (YES/NO)");
				String sale1 = sc.next();
				CM.changeCommodity(index, name1, price1, type1, sale1);
				break;
			case 4:
				for (Commodity commodity : CM.getCommodities()) {
					System.out.println(commodity);
				}
				break;
			case 5:
				while (isRun1) {
					System.out.println("Enter 1 to sort by name(Asc)");
					System.out.println("Enetr 2 to sort by name(Desc)");
					System.out.println("Enter 3 to sort by price(Asc)");
					System.out.println("Enter 4 to sort by price(Desc)");
					System.out.println("Enter 5 to sort by type(Asc)");
					System.out.println("Enter 6 to sort by type(Desc)");
					System.out.println("Enter 7 to sort by discount(Asc)");
					System.out.println("Enter 8 to sort by discount(Asc)");
					System.out.println("Enter 0 to enter previous menu");
					switch (sc.nextInt()) {
					case 1:
						CM.sortByNameAsc();
						break;

					case 2:
						CM.sortByNameDesc();
						break;
					case 3:
						CM.sortByPriceAsc();
						break;
					case 4:
						CM.sortByPriceDesc();
						break;
					case 5:
						CM.sortBySaleAsc();
						break;
					case 6:
						CM.sortBySaleDesc();
						break;
					case 7:
						CM.sortByTypeAsc();
						break;
					case 8:
						CM.sortByTypeDesc();
						break;
					case 0:
						isRun1 = false;
					}

				}
				break;
			case 0:
				isRun = false;
			}
		}

	}
}
