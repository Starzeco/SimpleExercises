package java5;

abstract public class Auto {
	protected String marka;
	protected int lk;
	public Auto() {
		marka="audi";
		lk=10;
		
	}
	public Auto(String marka, int lk) {
		this.marka=marka;
		this.lk=lk;
	}
	public String toString() {
		return marka;
	}
	abstract int IlePaliwa(); 
		
	
	
}
