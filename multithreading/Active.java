package multithreading;

public class Active implements Runnable {
	
	public boolean mustWait;
	
	public Active() {
		(new Thread(this)).start();
		mustWait = false;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (this) {
				if (mustWait)
					try {
						wait();
					} catch (InterruptedException e) {
					}
				try {
					System.out.println("action");
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
