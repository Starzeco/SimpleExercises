
public class PracownikGodz extends Pracownik {
	private int lg;
	public PracownikGodz(int pesel,int stawka,int lg) {
		super(pesel,stawka);
		this.lg=lg;
	}
	public double Pensja() {
		return lg*stawka;
	}
	public String toString() {
		return "Pracownik Godz="+ "Pensja="+Pensja();
	}
	public int getLg() {
		return lg;
	}
}
