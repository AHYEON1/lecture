package test3;

public class People { 
	
	String name; 
	int age;
	int money;
	String job; 
	int price;
	
	public People(String name, int age, int money, String job) {
		this.name = name;
		this.age =age;
		this.money=money;
		this.job =job; 
		
			
	} 
	
	public boolean payFee(int price) { 
		if(money>price) {
			return false;
		}else {
			money =money -price;
			return true;
		}
		
	public void takeBus() {
		Bus.takeBus();
		
	} 
	public void takeSubway() { 
		Subway.takeSubway();
		
	}
		
		
		
	}
	
	
	

}
