package car;

public class Manualcar extends Car {

	@Override
	public void drive() { 
	  System.out.println("사람이 직접 운전합니다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() { 
		System.out.println("사람이 브레이크로 정지합니다");
		// TODO Auto-generated method stub
		
	}

}
