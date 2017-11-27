package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Thread_run th = new Thread_run();
		Thread_runnable th2 = new Thread_runnable();
		th.start();
		th2.run();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Print in main: " + i);
		}
		*/
		
		Thread_run[] th1 = new Thread_run[10];
		for (int i = 0; i < 10; i++)
		{
			th1[i] = new Thread_run();
			th1[i].start();
		}
		Thread_runnable[] th2 = new Thread_runnable[10];
		for (int i = 0; i < 10; i++)
		{
			th2[i] = new Thread_runnable();
			th2[i].run();
		}
		for (int i = 0; i < 10; i++)
		{
			try {
				th1[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
