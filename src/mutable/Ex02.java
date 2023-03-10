package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		
		System.out.println("Ex02#main - start");
		Thread t0 = new Thread(new Task(), "thread-0");
		// tu dong goi den Thread#run >> Runable#run
		t0.start();
		// function sleep 2 seconds.
		doATask(2);
		System.out.println("Ex02 - end");
		
	}
	// thread execute Task - Runable
	private static class Task implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().getName() + "is running");
			System.out.println("Task#executing");
		}
	}
	private static void doATask(int second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} 
	}

}
