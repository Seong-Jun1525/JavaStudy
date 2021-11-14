package ch18;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]); // null
//		}
		
		library[0] = new Book("å1", "SJ");
		library[1] = new Book("å2", "SJ");
		library[2] = new Book("å3", "SJ");
		library[3] = new Book("å4", "SJ");
		library[4] = new Book("å5", "SJ");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
