package Queue;

import java.util.ArrayList;

public class Shelf { //책장 
	
	protected ArrayList<String> shelf; 
	
	public Shelf() { //생성자
		this.shelf = new ArrayList<String>(); //인스턴스 생성
	}
	
	public ArrayList<String> getShelf(){
		return this.shelf;
	}
	
	public int getCount() {
		return this.shelf.size();
	}

}
