package mutable;

public class Ex03 {
	public static void main(String[] args) {
		// Mutable task: exchange data >> StringBuider || StringBuffer
		MutableTask task = new MutableTask();
		Thread tA = new Thread(task, "Thread-A");
		tA.start();

		Thread tB = new Thread(task, "Thread-B");
		tB.start();
		// thực thi xong task A và task B rồi mới đến hàm main.
		try {
			tA.join();
			tB.join();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("length: " + task.length());
	}

	private static class MutableTask implements Runnable {
		// private StringBuffer Mutable;
		private StringBuilder Mutable;
		private int count = 50000;

		public MutableTask() {
			// Mutable = new StringBuffer();
			Mutable = new StringBuilder();
		}

		@Override
		public void run() {
			for (int i = 1; i <= count; i++) {
				System.out.println(Thread.currentThread().getName() + "---->" + i);
	 			Mutable.append("A");
			}

		}

		public int length() {
			return Mutable.length();
		}

	}

}
