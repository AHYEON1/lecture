package Queue;

public interface Queue {
	void enQueue (String title); // 넣는 기능
	String deQueue(); //뺴는 기능 ,반환값이 string
	int getSize(); 

}
