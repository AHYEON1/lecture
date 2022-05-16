package test1;

public class main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작!"); 
		
		int math =90; 
		int science =88;
		int english =96; 
		
		Grade me = new Grade();
		System.out.println("수학,과학,영어 점수의 평균:"+ me.average(english, science, math));
		
		
	}
}