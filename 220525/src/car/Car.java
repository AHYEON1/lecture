package car;

public abstract class Car { 
	public abstract void drive(); 
	public abstract void stop();
	
	
	
	public void startcar() {
		System.out.println("�õ��� �մϴ�");
	} 
	
	public void turnoff() {
		System.out.println("�õ��� ���ϴ� ");
	} 
	
	public final void run() {
		startcar();
		drive();
		stop();
		turnoff();
	}

}
