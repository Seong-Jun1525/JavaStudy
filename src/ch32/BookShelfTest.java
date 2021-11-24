package ch32;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("å 1");
		bookQueue.enQueue("å 2");
		bookQueue.enQueue("å 3");
		bookQueue.enQueue("å 4");
		bookQueue.enQueue("å 5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
