
public class Pietro extends Pokoj {
private int liczbaPokoi;

public Pietro() {
	super();
	liczbaPokoi=0;
}
public Pietro(int liczbaPokoi, double d�ugo��, double szeroko��, double cenaZaPokoj) {
	super(d�ugo��, szeroko��, cenaZaPokoj);
	this.liczbaPokoi=liczbaPokoi;
}
public Pietro(Pietro k) {
	super(k.d�ugo��,k.szeroko��,k.cenaZaPokoj);
	liczbaPokoi=k.liczbaPokoi;
	
}
public String toString() {
	return "Pietro="+" " + super.toString()+" " + liczbaPokoi;
}

}
