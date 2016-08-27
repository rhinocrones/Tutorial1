package threds;

import java.util.Scanner;

public class MyThread extends Thread {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter smth");
		int z = sc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 0; i < z; i++) {
			int c=a+b;
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(c);
			System.out.print(" ");
			a=c;
			b=a-b;
		}
		sc.close();
		System.out.println("done");
	}

}
