package sec04;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//동시에 사용을 못하게 한다.
	/*public synchronized void setMemory(int memory) {
		this.memory = memory;
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println("2초 후");
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}*/
	
	public void setMemory(int memory) {
		
		synchronized (this) {
			this.memory = memory;
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println("2초 후");
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}

}
