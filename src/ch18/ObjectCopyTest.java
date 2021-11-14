package ch18;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("책1", "SJ");
		library[1] = new Book("책2", "SJ");
		library[2] = new Book("책3", "SJ");
		library[3] = new Book("책4", "SJ");
		library[4] = new Book("책5", "SJ");
		
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		System.out.println("== library == ");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("== copyLibrary == ");
//		for(Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("SA");
		library[0].setTitle("Book");
		
		System.out.println("== 수정 후 library == ");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== 수정 후 copyLibrary == ");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
