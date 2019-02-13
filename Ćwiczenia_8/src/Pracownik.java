
 abstract class Pracownik {
	protected int pesel;
	protected int stawka;
	public Pracownik() {
		pesel=0;
		stawka=0;
		
	}
	public Pracownik(int pesel,int stawka) {
		this.pesel=pesel;
		this.stawka=stawka;
	}
	abstract double Pensja();
	public int getPesel() {
		return pesel;
	}
	public int getStawka() {
		return stawka;
	}
}
