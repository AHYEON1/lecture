package Queue; //FIFO

public class BookShelf extends Shelf implements Queue{ // å���� ��ӹް� ť�� ���ø���Ʈ�Ѵ�

	@Override
	public void enQueue(String title) { //�ִ°� 
		shelf.add(title); //Ÿ��Ʋ���־��� 
	}

	@Override
	public String deQueue() { //���°� 
		if(getSize() <= 0) {
			return "ť�� ������ϴ�";
		}
		return shelf.remove(0); //�����Ͱ��� ��ȯ�ϸ鼭 �������� ,ù���� �� �A��
	}

	@Override
	public int getSize() { //�迭 ���� ������ ��ȯ
		return getCount();
	}
	
}
