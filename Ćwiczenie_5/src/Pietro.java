
public class Pietro extends Pokoj {
private int liczbaPokoi;

public Pietro() {
	super();
	liczbaPokoi=0;
}
public Pietro(int liczbaPokoi, double d³ugoœæ, double szerokoœæ, double cenaZaPokoj) {
	super(d³ugoœæ, szerokoœæ, cenaZaPokoj);
	this.liczbaPokoi=liczbaPokoi;
}
public Pietro(Pietro k) {
	super(k.d³ugoœæ,k.szerokoœæ,k.cenaZaPokoj);
	liczbaPokoi=k.liczbaPokoi;
	
}
public String toString() {
	return "Pietro="+" " + super.toString()+" " + liczbaPokoi;
}

}
