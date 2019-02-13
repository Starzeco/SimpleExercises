import java.util.ArrayList;
import java.util.Random;
public class Projekt_Hotel {
	private int pole;
	Random r=new Random();
	public Projekt_Hotel(int i) {
		pole=i;
	}
	public void zrób() {
		for(int i=0;i<5;i++) {
			Projekt_Hotel k=new Projekt_Hotel(r.nextInt(9));
			System.out.println(k);
		}
	}
	public String toString() {
		return " "+pole;
	}
	public static void main(String[] args) {
		/*Hotel europa=new Hotel(30);
		Osoba klient1=new Osoba("kowalski",40);
		Osoba klient2=new Osoba("krakowiak",25);
		europa.wynajmij(klient1);
		System.out.println(europa.ilePokoi());
		europa.wynajmij(klient2);
		System.out.println(europa.ilePokoi());
		
		
		europa.czyJestPokoj();
		System.out.println(europa.czyJestPokoj());
	
		System.out.println(europa.dajNajmlodszego());*/
		
		/*ArrayList<Integer> k=new ArrayList<Integer>();
		k.add(2);
		k.add(0, 3);
		for(Integer p:k) {
			System.out.println(p);
		}*/
		/*Projekt_Hotel k=new Projekt_Hotel(1);
		k.zrób();*/
		
		ArrayList<Integer> k=new ArrayList<Integer>();
		k.add(5);
		k.add(8);
		k.add(3);
		k.add(7);
		for(int i=0;i<k.size() && k.get(i)==8;i++) {
			System.out.println(k.get(i));
		}
		
	}

}
