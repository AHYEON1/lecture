package test2;

public class main { 
	public static void main(String[] args) {
		
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,7,6);
		Rectangle t = new Rectangle(1,1,10,10); 
		
		r.show(); 
		System.out.println("s�� ������"+ s.square());
		
		if(t.contains(r))System.out.println("t�� r�� �����մϴ� ");
		if(t.contains(s))System.out.println("t�� s�� �����մϴ� ");
		
		
		
	}

}