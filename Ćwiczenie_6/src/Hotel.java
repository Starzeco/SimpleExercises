
public class Hotel {
	
	private Osoba[] pokoje;
	int liczbaWynajetychPokoi;
	
	public Hotel(int liczbaPokoi) {
		pokoje = new Osoba[liczbaPokoi];
		liczbaWynajetychPokoi=0;
	}
	public boolean czyJestPokoj() {
		if(pokoje.length-liczbaWynajetychPokoi>0) {
			return true;
		}
		return false;
	}
	public int dajNajmlodszego() {
		int k=Integer.MAX_VALUE;
		for(int i=0; i<pokoje.length; i++) {
			if(pokoje[i]!=null) {
				if(pokoje[i].getWiek()<k) {
					k=pokoje[i].getWiek();
					
				}
			}
		}return k;
	}
	
	public int ilePokoi() {
		int a=pokoje.length-liczbaWynajetychPokoi;
		return a;
	}
	public void wynajmij(Osoba x) {
		for(int i=0; i<pokoje.length; i++) {
			if(pokoje[i]==null) {
				pokoje[i]=x;
				liczbaWynajetychPokoi++;
				System.out.println("Numer pokoju=" +(i+1));
				break;
			}
		}
	}
	public boolean czyWynajmuje(String nazwisko) {
		for(int i=0; i<pokoje.length; i++) {
			if(pokoje[i]!=null) {
				if(pokoje[i].getNazwisko().equals(nazwisko)) {
					return true;
				}		
			}
		}return false;
	}
	
	public void zwolnij(String nazwisko) {
		for(int i=0; i<pokoje.length; i++) {
			if(pokoje[i]!=null) {
				if(pokoje[i].getNazwisko().equals(nazwisko)) {
					pokoje[i]=null;
				}		
			}
		}
	}
	
}
				
		
	


