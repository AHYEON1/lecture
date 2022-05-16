package test_project;

public class ex6 {
 public static void main(String[] args) {
 int sum =0; 
 int num = -1; 
 while(true) {
	 if(num%2 != 0) {
		 sum += sum;
	
	 }else {
		 sum += num*-1;
	
	 }
	 if(sum >=100) {
		 System.out.println(num);
		 break;
	 }
	 num++;
 } 
// 썜 해설 
 int count =0; 
 int sum2 =0;
	while(true) { 
		count ++;
		if(count %2 ==1) {
			sum2 += count;
		}else if(count % 2==0) {
			sum2 -= count;
		}
		if(sum2 >= 100) {
			break;
		}
		
	} 
	System.out.println("마지막으로 더한값 :"+count);
	System.out.println("총합 :"+sum2);
	  }
	  
 }


 
	 
