package java5;

public class Trasa extends Toyota {
	private int pol;
	public Trasa() {
		super();
		pol=2;
	}
	public Trasa(String marka, int lk, String model,int zuz, int pol) {
		super(marka,lk,model,zuz);
		this.pol=pol;
		
		
	}
	public int Zasi�g() {
		return zuz;
	}
	public String toString() {
		return "Trasa="+" "+Zasi�g()+" "+super.toString();
	}
}
