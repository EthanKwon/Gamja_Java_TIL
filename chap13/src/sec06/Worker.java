package sec06;

public class Worker extends Person{
	private String worker;
	
	public Worker(String worker) {
		super(worker);
		this.worker = worker;
	}
	public String toString() {return worker;}

}
