package Queue;

import java.util.ArrayList;

public class Shelf { //å�� 
	
	protected ArrayList<String> shelf; 
	
	public Shelf() { //������
		this.shelf = new ArrayList<String>(); //�ν��Ͻ� ����
	}
	
	public ArrayList<String> getShelf(){
		return this.shelf;
	}
	
	public int getCount() {
		return this.shelf.size();
	}

}
