package Stack;

public class BookShelf2 extends Shelf2 implements Stack{

	@Override
	public int getsize() {
		return getCount();
	}

	@Override
	public void push(String title) {
		shelf2.add(title); 
		System.out.println(title+"�� ť�� �߰��Ǿ����ϴ� ");
		
	}

	@Override
	public String pop() {
	
		if( getsize() <= 0) {
			return "ť�� ������ϴ�";
		}else {
			System.out.println(getCount()+"ť�� ���� �Ǿ����ϴ�");
			return shelf2.remove(getCount()-1); 
		
			
		}
		
	} 


}
