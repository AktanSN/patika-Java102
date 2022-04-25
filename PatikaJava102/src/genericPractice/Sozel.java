package genericPractice;

public class Sozel extends Aday {

	public Sozel(int turkceNet,int matematikNet,int edebiyatNet,int fizikNet,String isim) {
		super(turkceNet,matematikNet,edebiyatNet,fizikNet,isim);
	}

	@Override
	public int puanHesapla() {
		return this.getTurkceNet() *5 +this.getMatematikNet()*5+this.getFizikNet()*1+this.getEdebiyatNet()*4;
	}
}
