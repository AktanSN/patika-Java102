package singersPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Singers singers = new Singers();
	private static Scanner scan = new Scanner(System.in);

	public static void printSelections() {
		System.out.println("-----------------------------");
		System.out.println("0-) ��lemleri G�r�nt�le");
		System.out.println("1-) �ark�c�lar� G�r�nt�le");
		System.out.println("2-) �ark�c� Ekle");
		System.out.println("3-) �ark�c� G�ncelle");
		System.out.println("4-) �ark�c� Sil");
		System.out.println("5-) �ark�c� Ara");
		System.out.println("6-) Uygulamadan ��k");
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {
		boolean end = true;
		while (end) {
			printSelections();
			System.out.print("Yapmak istedi�iniz i�lemi se�in: ");
			int selection = scan.nextInt();
			scan.nextLine();
			System.out.println();
			switch (selection) {
			case 0:
				break;
			case 1:
				singers.printSingers();
				break;
			case 2:
				System.out.print("Eklemek istedi�iniz �ark�c�y� girin: ");
				String newSinger = scan.nextLine();
				singers.addSinger(newSinger);
				break;
			case 3:
				System.out.print("G�ncellemek istedi�iniz �ark�c�y� girin: ");
				String oldSinger = scan.nextLine();
				System.out.print("Yeni �ark�c�y� girin: ");
				newSinger = scan.nextLine();
				singers.updateSinger(oldSinger, newSinger);
				break;
			case 4:
				System.out.print("Silmek istedi�iniz �ark�c�y� girin: ");
				oldSinger = scan.nextLine();
				singers.deleteSinger(oldSinger);
				break;
			case 5:
				System.out.print("Bulmak istedi�iniz �ark�c�y� girin: ");
				String singer = scan.nextLine();
				singers.findSinger(singer);
				break;
			case 6:
				System.out.println("G�r��mek �zere...");
				end = false;
				break;
			default:
				System.out.println("Yanl�� giri� yapt�n�z.");

			}
		}
	}

}
