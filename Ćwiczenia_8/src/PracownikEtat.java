
public class PracownikEtat extends Pracownik {
	protected double etat;
	public PracownikEtat() {
		super();
		etat=0.0;
	}
	public double Pensja() {
		return stawka*etat;
	}
	public PracownikEtat(int pesel,int stawka,int etat) {
		super(pesel,stawka);
		this.etat=etat;
	}
	public String toString() {
		return "Pracownik Etatowy="+ "Pensja="+Pensja();
	}
	public double getEtat() {
		return etat;
	}
}
