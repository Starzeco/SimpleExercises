
public class Prezes extends PracownikEtat {
	public int premia;
	public Prezes(int pesel,int stawka,int etat, int premia) {
		super(pesel,stawka,etat);
		this.premia=premia;
	}
	public double Pensja2() {
	return stawka+premia;	
	}
	public String toString() {
		return "Prezes="+"Pensja="+Pensja();
	}
	public int getPremia() {
		return premia;
	}
}
