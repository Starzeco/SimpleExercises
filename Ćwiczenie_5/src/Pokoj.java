
public class Pokoj implements Przelicznik {
	protected double d³ugoœæ;
	protected double szerokoœæ;
	protected double cenaZaPokoj;
	public Pokoj() {
		d³ugoœæ=0.0;
		szerokoœæ=0.0;
		cenaZaPokoj=0.0;
	}
	public Pokoj(double d³ugoœæ, double szerokoœæ, double cenaZaPokoj) {
		this.d³ugoœæ=d³ugoœæ;
		this.szerokoœæ=szerokoœæ;
		this.cenaZaPokoj=cenaZaPokoj;
		
	}
	public Pokoj(Pokoj k) {
		d³ugoœæ=k.d³ugoœæ;
		szerokoœæ=k.szerokoœæ;
		cenaZaPokoj=k.cenaZaPokoj;
	}
	public double Powierzchnia() {return d³ugoœæ*szerokoœæ;}
	public double CenaZaPokoj() {return cenaZaPokoj;}
	public String toString() {
		return "Pokój="+ " " + d³ugoœæ+ " " + szerokoœæ+ " " + Powierzchnia()+ " " + CenaZaPokoj();
	}
}
