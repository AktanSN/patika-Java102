package kitapSiralayici;

import java.util.Comparator;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Simyac� ", 215, "Paulo Coelho", "20-05-2000");
		Book b2 = new Book("Y�zy�ll�k Yaln�zl�k", 322, "Gabriel Garc�a M�rquez", "20-05-2000");
		Book b3 = new Book("Su� ve Ceza", 180, "Fyodor Dostoyevski", "20-05-2000");
		Book b4 = new Book("Hayvan �iftli�i", 200, "George Orwell", "20-05-2000");
		Book b5 = new Book("D�n���m", 100, "Franz Kafka", "20-05-2000");

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
			System.out.print("Kitap �smi: " + i.getBookName() + "\t\t");
			System.out.print("Sayfa Say�s�: " + i.getPageNumber() + "\t\t");
			System.out.print("Yazar �smi: " + i.getAuthorName() + "\t\t");
			System.out.println("Bas�m Tarihi: " + i.getReleaseDate());
		}
		
		System.out.println(
				"=====================================================================================================================");
		System.out.println("============ Sayfa Say�s�na G�re ===========================================================================================");
		for (Book i : books2) {
			System.out.print("Kitap �smi: " + i.getBookName() + "\t\t");
			System.out.print("Sayfa Say�s�: " + i.getPageNumber() + "\t\t");
			System.out.print("Yazar �smi: " + i.getAuthorName() + "\t\t");
			System.out.println("Bas�m Tarihi: " + i.getReleaseDate());
		}
		System.out.println(
				"=====================================================================================================================");

	}

}
