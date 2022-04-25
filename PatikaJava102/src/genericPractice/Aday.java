package genericPractice;

public abstract class Aday {
	private int turkceNet;
	private int matematikNet;
	private int edebiyatNet;
	private int fizikNet;
	private String isim; 
	public Aday(int turkceNet, int matematikNet, int edebiyatNet, int fizikNet,String isim) {

		this.turkceNet = turkceNet;
		this.matematikNet = matematikNet;
		this.edebiyatNet = edebiyatNet;
		this.fizikNet = fizikNet;
		this.isim=isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getTurkceNet() {
		return turkceNet;
	}

	public void setTurkceNet(int turkceNet) {
		this.turkceNet = turkceNet;
	}

	public int getMatematikNet() {
		return matematikNet;
	}

	public void setMatematikNet(int matematikNet) {
		this.matematikNet = matematikNet;
	}

	public int getEdebiyatNet() {
		return edebiyatNet;
	}

	public void setEdebiyatNet(int edebiyatNet) {
		this.edebiyatNet = edebiyatNet;
	}

	public int getFizikNet() {
		return fizikNet;
	}

	public void setFizikNet(int fizikNet) {
		this.fizikNet = fizikNet;
	}

	public abstract int puanHesapla();

}
