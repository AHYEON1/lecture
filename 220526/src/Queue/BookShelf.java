package Queue; //FIFO

public class BookShelf extends Shelf implements Queue{ // 책장을 상속받고 큐를 임플리먼트한다

	@Override
	public void enQueue(String title) { //넣는거 
		shelf.add(title); //타이틀을넣어줌 
	}

	@Override
	public String deQueue() { //빼는거 
		if(getSize() <= 0) {
			return "큐가 비었습니다";
		}
		return shelf.remove(0); //데이터값을 반환하면서 지워진다 ,첫번쨰 껄 뺸다
	}

	@Override
	public int getSize() { //배열 갯수 사이즈 반환
		return getCount();
	}
	
}
