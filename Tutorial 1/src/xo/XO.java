package xo;

import java.util.Scanner;

public class XO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][3];
		boolean isRun = true;
		while (isRun) {
			print(array);
			int y = read(sc) - 1;
			int x = read(sc) - 1;
			if (array[x][y] == 0) {
				array[x][y] = 1;
				isRun = someOneWin(array, 3);
				if (!isRun) {
					System.out.println("���������� ������");
				} else {
					cpu(array);
					isRun = someOneWin(array, -3);
					if (!isRun)
						System.out.println("�������� ������");
				}
			} else {
				System.out.println("����� �����, ��������?! ��� �������");
			}
		}
	}

	static boolean someOneWin(int[][] array, int who) {
		int result = 0;
		for (int i = 0; i < 3; i++) {
			result = array[i][0] + array[i][1] + array[i][2];
			if (result == who)
				return false;
			result = array[0][i] + array[1][i] + array[2][i];
			if (result == who)
				return false;
		}
		result = array[0][0] + array[1][1] + array[2][2];
		if (result == who)
			return false;
		result = array[2][0] + array[1][1] + array[0][2];
		if (result == who)
			return false;
		return true;
	}

	static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0) {
					System.out.print("  ");
				} else if (array[i][j] == 1) {
					System.out.print("X ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	static int read(Scanner sc) {
		if (sc.hasNextInt()) {
			return sc.nextInt();
		}
		return 0;
	}

	static int random(int from, int to) {
		return (int) Math.round(Math.random() * (to - from) + from);
	}

	static void cpu(int[][] array) {
		boolean isRun = true;
		while (isRun) {
			int x = random(0, 2);
			int y = random(0, 2);
			if (array[x][y] == 0) {
				array[x][y] = -1;
				isRun = false;
			}
		}
	}

}
