
public class Pokoj implements Przelicznik {
	protected double d�ugo��;
	protected double szeroko��;
	protected double cenaZaPokoj;
	public Pokoj() {
		d�ugo��=0.0;
		szeroko��=0.0;
		cenaZaPokoj=0.0;
	}
	public Pokoj(double d�ugo��, double szeroko��, double cenaZaPokoj) {
		this.d�ugo��=d�ugo��;
		this.szeroko��=szeroko��;
		this.cenaZaPokoj=cenaZaPokoj;
		
	}
	public Pokoj(Pokoj k) {
		d�ugo��=k.d�ugo��;
		szeroko��=k.szeroko��;
		cenaZaPokoj=k.cenaZaPokoj;
	}
	public double Powierzchnia() {return d�ugo��*szeroko��;}
	public double CenaZaPokoj() {return cenaZaPokoj;}
	public String toString() {
		return "Pok�j="+ " " + d�ugo��+ " " + szeroko��+ " " + Powierzchnia()+ " " + CenaZaPokoj();
	}
}
