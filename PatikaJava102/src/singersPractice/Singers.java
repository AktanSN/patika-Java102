package singersPractice;

import java.util.ArrayList;

public class Singers {
	private ArrayList<String> singers;

	public Singers() {
		this.singers = new ArrayList<>();
	}

	public ArrayList<String> getSingers() {
		return singers;
	}

	public void setSingers(ArrayList<String> singers) {
		this.singers = singers;
	}
	
	public void printSingers() {
		if(this.getSingers().size()==0) {
			System.out.println("Listede þarkýcý mevcut deðil.");
		}else {
			for(int i=0;i<singers.size();i++) {
				System.out.println((i+1)+". Þarkýcý: " + this.getSingers().get(i));
			}
		}
		
	}
	
	public void addSinger(String singer) {
		this.singers.add(singer);
		System.out.println(singer+" Listeye Eklendi..");
	}
	
	public void updateSinger(String singer1,String singer2) {
		if(this.getSingers().contains(singer1)) {
			int indexOfSinger = this.getSingers().indexOf(singer1);
			this.getSingers().set(indexOfSinger, singer2);
			System.out.println(singer1+ " þarkýcýsý " + singer2+" þarkýcýsý olarak deðiþtirildi..");
		}else {
			System.out.println(singer1 + " isminde þarkýcý mevcut deðil.");
		}
		
	}
	
	public void deleteSinger(String singer) {
		if(this.getSingers().contains(singer)) {
			this.getSingers().remove(singer);
			System.out.println(singer+" þarkýcýsý listeden silindi..");
		}else {
			System.out.println(singer+" zaten listede mevcut deðil.");
		}
	}
	
	public void findSinger(String singer) {
		if(this.getSingers().contains(singer)) {
			System.out.println(singer + " listede " + (this.getSingers().indexOf(singer)+1) +". sýrada bulunuyor.");
		}else {
			System.out.println(singer+" listede mevcut deðil..");
		}
	}
	
	

}
