package car;

public abstract class Car { 
	public abstract void drive(); 
	public abstract void stop();
	
	
	
	public void startcar() {
		System.out.println("시동을 켭니다");
	} 
	
	public void turnoff() {
		System.out.println("시동을 끕니다 ");
	} 
	
	public final void run() {
		startcar();
		drive();
		stop();
		turnoff();
	}

}
