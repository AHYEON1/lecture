package Customer;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}

}
