package ch20;

import java.util.ArrayList;

import ch18.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("å1", "SJ"));
		library.add(new Book("å2", "SJ"));
		library.add(new Book("å3", "SJ"));
		library.add(new Book("å4", "SJ"));
		library.add(new Book("å5", "SJ"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}
}