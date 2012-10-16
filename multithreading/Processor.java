package multithreading;

public class Processor {

	boolean valueSet;
	int counter;
	
	public Processor() {
		valueSet = false;
		counter = 0;
	}
	
	public void put(int i) {
		synchronized (this) {
			if (valueSet)
				try {
					System.out.println("waiting...");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("Interrupted!");
				}
			counter = i;
			valueSet = true;
			System.out.println("Put " + counter);
			notify();
		}
	}
	
	public int get() {
		synchronized (this) {
			if (!valueSet)
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("Interrupted get!");
				}
			System.out.println("Got " + counter);
			valueSet = false;
			notify();
			return counter;
		}
	}
}

class Consumer extends Thread {
	
	Processor p;
	
	public Consumer(Processor p) {
		this.p = p;
		(new Thread(this)).start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while (true) {
			p.put(i++);
		}
	}
}

class Producer implements Runnable {
	
	Processor p;
	
	public Producer(Processor p) {
		this.p = p;
		(new Thread(this)).start();
	}
	
	@Override
	public void run() {
		while (true) {
			p.get();
		}
	}
}

class Practice {
	public static void main(String[] args) {
		Processor p = new Processor();
		Producer prod = new Producer(p);
		Consumer cons = new Consumer(p);
	}
}