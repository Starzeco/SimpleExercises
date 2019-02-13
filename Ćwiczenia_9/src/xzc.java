import java.util.Scanner;



public class xzc {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	    System.out.print("Wpisz liczbe osob:");
	    int n = in.nextInt();

	    Statystyka statystyka = new Statystyka(n);

	    statystyka.wyswietlKlientow();
	    System.out.println();
	    statystyka.maksWaga();

	}

}
