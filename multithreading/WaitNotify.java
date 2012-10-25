package multithreading;

public class WaitNotify {
	
	Active active; 
	
	public static void main(String[] args) {
		WaitNotify wn = new WaitNotify();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("making wait");
//		wn.makeWait();
		wn.interruptActive();
	}
	
	public WaitNotify() {
		active = new Active();
	}
	
	public void makeWait() {
		active.mustWait = true;
	}
	
	public void interruptActive() {
	}
}