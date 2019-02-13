package lab4;

public class x {
	private int n;     //liczba klientow
	private s[] tab;
	
	//konstruktory -------------
	public x() {
	this.n=0;
	tab= null;
	}
	public x(int liczba) {
		this.n = liczba;
		this.tab = new s[n];
		 for (int i=0; i<tab.length; i++) {
			 tab[i] = new s();
			 tab[i].czytaj();
		 }//koniec for
	}//koniec przeciazonego
	
	public void wyswietlKlientow() {
		for (int i=0; i<tab.length; i++) {
			tab[i].drukuj();
			System.out.println(" ");
		}//koniec for
	}//koniec wyswietl
	
	public int saldoMax() {
		int counter=0;
		double max=0;
		
		for (s i : tab) {
			if (max < i.dajSaldo()) {
				max = i.dajSaldo();
			}//koniec if
		}//koniec for
		
		for (s i : tab) {
			if(max == i.dajSaldo()) {
				i.drukuj();
				counter++;
			}//koniec if
		}//koniec for
		
		return counter;
	}//koniec saldoMax
}
