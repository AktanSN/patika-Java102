package genericPractice;

public class Sayisal extends Aday{
	
	public Sayisal(int turkceNet,int matematikNet,int edebiyatNet,int fizikNet,String isim) {
		super(turkceNet,matematikNet,edebiyatNet,fizikNet,isim);
	}

	@Override
	public int puanHesapla() {
		return this.getTurkceNet() *5 +this.getMatematikNet()*5+this.getFizikNet()*4+this.getEdebiyatNet()*1;
	}
	

}
