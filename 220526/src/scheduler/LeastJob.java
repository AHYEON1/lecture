package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재상담 업무가 없거나 상담대기가 가장적은 상담원에게 할당됩니다");
		// TODO Auto-generated method stub
		
	}
	

}
