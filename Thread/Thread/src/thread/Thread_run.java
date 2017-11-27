package thread;

public class Thread_run extends Thread {
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Print in " + getName() + ": " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
