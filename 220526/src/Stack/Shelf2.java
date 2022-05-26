package Stack;

import java.util.ArrayList;

public class Shelf2 { 
	protected ArrayList<String> shelf2;
	
	public Shelf2() {
		this.shelf2 = new ArrayList<String>(); //인스턴스 생성
	}
	
	public ArrayList<String> getShelf(){
		return this.shelf2;
	}
	public int getCount() {
		return this.shelf2.size();
	}
	

}
