
public class CompleteCalc extends Calculator{
	
	public int times(int num1, int num2) {
		return num1* num2;
		
	}
	
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2;
		}
		return ERROR;
	}
	public void showlnfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�");
	}

	@Override
	public int substrace(int num1, int num2) {
	
		return num1 -num2;
	}

}
