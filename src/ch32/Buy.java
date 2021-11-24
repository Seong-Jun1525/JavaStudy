package ch32;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("buy order");
	}
}
