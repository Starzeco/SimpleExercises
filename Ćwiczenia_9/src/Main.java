

public class Main {

	public static void main(String[] args) {
	
		
		Osoba nowy = new Osoba (1234, "JanKowalski", 24.5);
		//nowy.drukuj();
		//nowy.czytaj();
		
		
		
		Statystyka stat = new Statystyka(3);
		
		stat.wyswietlKlientow();
		int t=stat.maksWaga();
		System.out.println(t);
	}
	
	
	
}
