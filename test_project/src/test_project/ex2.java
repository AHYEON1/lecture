package test_project;

public class ex2 {
	public static void main(String[] args) {
	 
		int x =11;
		char ch='X';
		
//		조건식 1번
		if( 10<x && x<20 ) {
			System.out.println("참");
		} 
//		조건식 2번 
	
		if( ch =='x' || ch =='X' ) {
			System.out.println("참");
		}
		
//		조건식 3번
		if(ch <= 9) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}

	}
		
}
