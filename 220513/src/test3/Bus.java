package test3;

public class Bus { 
	int money;
	int student_price;
	int woker_price;
	int customerCount;   
	int price;
	
	private Bus() {
		System.out.println("bus ������ ȣ��");
	} 
	
	public void takeBus(People pp) {
		if (pp.money < 1000) {

			if (pp.job == "������") {
				woker_price = price + 1000;
				pp.money -= woker_price;
				customerCount++;
			} else {
				student_price = price + 500;
				pp.money -= student_price;
				customerCount++;
			}

		}
	
		
	}

}
