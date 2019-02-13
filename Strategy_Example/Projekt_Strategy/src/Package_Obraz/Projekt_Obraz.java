package Package_Obraz;

import Package_AlgObrazu.Sposob_1_NaWykonaniePreProcessing;
import Package_Student1.Student1;
import Package_Student2.Student2;

public class Projekt_Obraz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 st1 = new Student1();
		st1.WykonajPreProcessing();
		st1.WyswietlInfo();
		
		
		System.out.println("\n\n");
		
		
		Student2 st2 = new Student2();
		st2.WykonajPreProcessing();
		st2.WyswietlInfo();
		
		System.out.println("\n\n");
		
		
		//Student2 decydujê u¿yæ Algorytmu nr 1 na Pre Processing !
		st2.UstawPreProcessing(new Sposob_1_NaWykonaniePreProcessing(), "Algorytm 1");
		st2.WykonajPreProcessing();
		st2.WyswietlInfo();
	}

}
