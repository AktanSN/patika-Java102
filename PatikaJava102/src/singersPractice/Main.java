package singersPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Singers singers = new Singers();
	private static Scanner scan = new Scanner(System.in);

	public static void printSelections() {
		System.out.println("-----------------------------");
		System.out.println("0-) Ýþlemleri Görüntüle");
		System.out.println("1-) Þarkýcýlarý Görüntüle");
		System.out.println("2-) Þarkýcý Ekle");
		System.out.println("3-) Þarkýcý Güncelle");
		System.out.println("4-) Þarkýcý Sil");
		System.out.println("5-) Þarkýcý Ara");
		System.out.println("6-) Uygulamadan çýk");
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {
		boolean end = true;
		while (end) {
			printSelections();
			System.out.print("Yapmak istediðiniz iþlemi seçin: ");
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
				System.out.print("Eklemek istediðiniz þarkýcýyý girin: ");
				String newSinger = scan.nextLine();
				singers.addSinger(newSinger);
				break;
			case 3:
				System.out.print("Güncellemek istediðiniz þarkýcýyý girin: ");
				String oldSinger = scan.nextLine();
				System.out.print("Yeni Þarkýcýyý girin: ");
				newSinger = scan.nextLine();
				singers.updateSinger(oldSinger, newSinger);
				break;
			case 4:
				System.out.print("Silmek istediðiniz þarkýcýyý girin: ");
				oldSinger = scan.nextLine();
				singers.deleteSinger(oldSinger);
				break;
			case 5:
				System.out.print("Bulmak istediðiniz þarkýcýyý girin: ");
				String singer = scan.nextLine();
				singers.findSinger(singer);
				break;
			case 6:
				System.out.println("Görüþmek üzere...");
				end = false;
				break;
			default:
				System.out.println("Yanlýþ giriþ yaptýnýz.");

			}
		}
	}

}
