package arrayEample;

public class MultiArray { 
 public static void main(String[] args) {
	 int[][] arr2 = new int[5][5];
	 int num =1;
	 for(int i =0; i<5; i++) {
		 for(int j =0; j<arr2[i].length; j++) {
			 arr2[i][j] = num++;
			 System.out.println(arr2[i][j]);
			 
		 }

		
	 }
 }

}
