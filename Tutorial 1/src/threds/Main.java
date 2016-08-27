package threds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private static final ExecutorService SERVICE = Executors.newFixedThreadPool(1);
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		NewThread newThread = new NewThread();
		myThread.run();
		newThread.run();
		
	}

}
