package genericPractice;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static <T extends Aday> ArrayList<T> birinci(ArrayList<T> adayList) {
		for (int i = 0; i < adayList.size() - 1; i++) {
			for (int j = i + 1; j < adayList.size(); j++) {
				if (adayList.get(i).puanHesapla() < adayList.get(j).puanHesapla()) {
					T temp = adayList.get(i);
					adayList.set(i, adayList.get(j));
					adayList.set(j, temp);

				}
			}
		}

		return adayList;

	}

	public static void main(String[] args) {
		ArrayList<Aday> adayList = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Puan Hesaplama Uygulamasýna Hoþgeldiniz...\n");
		boolean end = true;
		while (end) {
			System.out.println("Adayýn Bölümünü Seçiniz\n");
			System.out.println("Sayýsal için --> 1");
			System.out.println("Sözel için --> 2\n");

			System.out.print("Seçim: ");
			int secim = scan.nextInt();
			scan.nextLine();
			System.out.println();
			System.out.print("Adayýn ismini girin: ");
			String isim = scan.nextLine();
			System.out.print("Türkçe netini girin: ");
			int turkceNet = scan.nextInt();
			System.out.print("Matematik netini girin: ");
			int matematikNet = scan.nextInt();
			System.out.print("Fizik netini girin: ");
			int fizikNet = scan.nextInt();
			System.out.print("Edebiyat netini girin: ");
			int edebiyatNet = scan.nextInt();
			scan.nextLine();

			if (secim == 1) {
				adayList.add(new Sayisal(turkceNet, matematikNet, edebiyatNet, fizikNet, isim));
			}
			if (secim == 2) {
				adayList.add(new Sozel(turkceNet, matematikNet, edebiyatNet, fizikNet, isim));
			}

			System.out.print("\nBaþka aday eklemek istiyor musun(e/h): ");
			String devam = scan.nextLine();
			System.out.println();
			if (devam.equals("h")) {
				System.out.println("\nPuan Sýralamasý\n");
				ArrayList<Aday> array = birinci(adayList);
				for (int i = 0; i < array.size(); i++) {
					System.out.println((i + 1) + ". " + array.get(i).getIsim() + " Puaný: " + array.get(i).puanHesapla()
							+ " Bölümü: " + array.get(i).getClass().getSimpleName());
				}
				end = false;
			}
		}
	}

}
