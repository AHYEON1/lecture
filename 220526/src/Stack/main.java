package Stack;

public class main { 
	public static void main(String[] args) {
		Stack shelfStack = new BookShelf2();
		shelfStack.push("1��");
		shelfStack.push("2��");	
		shelfStack.push("3��");	
		
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		
		
	}

	
	

}
