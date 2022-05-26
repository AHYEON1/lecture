package scheduler;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		boolean isSupport =true;
		Scanner scan = new Scanner(System.in); 
	
		System.out.println("회원등급을 입력하시오");
		char ch = scan.next().charAt(0); 
		 

		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch =='L' || ch== 'l' ) {
			scheduler = new LeastJob();
		}else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원하지 않는 기능입니다");
			isSupport =false;
		}
		if(isSupport == true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		
		scan.close();
		
	}

}
