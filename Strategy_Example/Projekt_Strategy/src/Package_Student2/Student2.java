package Package_Student2;

import Package_Obraz.*;
import Package_AlgObrazu.*;

public class Student2 extends Obraz {

	public Student2() {
		
		PreProc = new Sposob_2_NaWykonaniePreProcessing();
		
		setAlgorytmInfo("Algorytm 2");
	}
	
	@Override
	public void WyswietlInfo() {
		
		System.out.println("Student 2 u¿ywa " + getAlgorytmInfo() + " na PreProcessing Obrazu Cyfrowego");
	}

	
	//Inne Metody Studenta 1, dotycz¹ce przetwarzania i analizy obrazu ...
	
}
