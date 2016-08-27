package threds;

import java.util.Scanner;

class NewThread implements Runnable {
	Thread thread;

	// �����������
	NewThread() {
		// ������ ����� ������ �����
		thread = new Thread(this, "����� ��� �������");
		System.out.println("������ ������ ����� " + thread);
		thread.start(); // ��������� �����
	}

	// ������������ ����� ��� ���������� Runnable
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter smth");
		int z = sc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 0; i < z; i++) {
			int c = a + b;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(c);
			System.out.print(" ");
			a = c;
			b = a - b;
		}
		sc.close();
		System.out.println("done");
	}
}
