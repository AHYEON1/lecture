package Stack;

public class main { 
	public static void main(String[] args) {
		Stack shelfStack = new BookShelf2();
		shelfStack.push("1¹ø");
		shelfStack.push("2¹ø");	
		shelfStack.push("3¹ø");	
		
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		
		
	}

	
	

}
