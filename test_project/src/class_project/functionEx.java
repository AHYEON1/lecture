package class_project;
 

public class functionEx {
  public static void main(String[] args) {
	  String strMessage ="���α׷��� ���� �Ǿ����ϴ�"; 
	  System.out.println(strMessage); 
	  int frist =5;
	  int second =5; 
	  int result = funAdd(frist,second); 
	  System.out.println(result);  
	  
	  int i =10;
	  int j=10;
	 int result2 =funMinus(i,j);
	System.out.println(result2);
	   
	int num =4;
	int num2 = 5;
	int result3 =fun2(num, num2);
	System.out.println(result3);
	  
  } 
  static int funAdd( int a, int b) {
	  int result = a +b; //�Լ� ȣ�� �ñ⿡ ����� ��ȯ�� �������� 
	  return result;
  }  
  
  
  static int funMinus(int i, int j) {
	  int result = i-j;
	  return result;
  }
   
static int fun2(int num , int num2) {
	int result = num*num2;
	return result;
}  
  
}


