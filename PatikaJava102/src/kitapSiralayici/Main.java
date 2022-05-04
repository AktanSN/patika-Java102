package kitapSiralayici;

import java.util.Comparator;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Simyacý ", 215, "Paulo Coelho", "20-05-2000");
		Book b2 = new Book("Yüzyýllýk Yalnýzlýk", 322, "Gabriel García Márquez", "20-05-2000");
		Book b3 = new Book("Suç ve Ceza", 180, "Fyodor Dostoyevski", "20-05-2000");
		Book b4 = new Book("Hayvan Çiftliði", 200, "George Orwell", "20-05-2000");
		Book b5 = new Book("Dönüþüm", 100, "Franz Kafka", "20-05-2000");

		TreeSet<Book> books = new TreeSet<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);

		TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {

				return o1.getPageNumber() - o2.getPageNumber();
			}
		});

		books2.add(b1);
		books2.add(b2);
		books2.add(b3);
		books2.add(b4);
		books2.add(b5);

		System.out.println(
				"============ A-Z ========================================================================================");
		for (Book i : books) {
			System.out.print("Kitap Ýsmi: " + i.getBookName() + "\t\t");
			System.out.print("Sayfa Sayýsý: " + i.getPageNumber() + "\t\t");
			System.out.print("Yazar Ýsmi: " + i.getAuthorName() + "\t\t");
			System.out.println("Basým Tarihi: " + i.getReleaseDate());
		}
		
		System.out.println(
				"=====================================================================================================================");
		System.out.println("============ Sayfa Sayýsýna Göre ===========================================================================================");
		for (Book i : books2) {
			System.out.print("Kitap Ýsmi: " + i.getBookName() + "\t\t");
			System.out.print("Sayfa Sayýsý: " + i.getPageNumber() + "\t\t");
			System.out.print("Yazar Ýsmi: " + i.getAuthorName() + "\t\t");
			System.out.println("Basým Tarihi: " + i.getReleaseDate());
		}
		System.out.println(
				"=====================================================================================================================");

	}

}
