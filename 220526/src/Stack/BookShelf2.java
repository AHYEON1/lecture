package Stack;

public class BookShelf2 extends Shelf2 implements Stack{

	@Override
	public int getsize() {
		return getCount();
	}

	@Override
	public void push(String title) {
		shelf2.add(title); 
		System.out.println(title+"번 큐가 추가되었습니다 ");
		
	}

	@Override
	public String pop() {
	
		if( getsize() <= 0) {
			return "큐가 비었습니다";
		}else {
			System.out.println(getCount()+"큐가 제거 되었습니다");
			return shelf2.remove(getCount()-1); 
		
			
		}
		
	} 


}
