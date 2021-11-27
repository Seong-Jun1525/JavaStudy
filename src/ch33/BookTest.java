package ch33;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("책 1", "SJ");
		
		System.out.println(book); // ch33.Book@7de26db8 -> toString() 메서드를 사용하면 입력한 값이 출력됩니다.
		
		String str = new String("test");
		System.out.println(str); // test
	}

}
