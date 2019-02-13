package Package_Student1;

import Package_Obraz.*;
import Package_AlgObrazu.*;

public class Student1 extends Obraz {

	public Student1() {
		
		PreProc = new Sposob_1_NaWykonaniePreProcessing();
		
		setAlgorytmInfo("Algorytm 1");
	}
	
	@Override
	public void WyswietlInfo() {
		
		System.out.println("Student 1 u¿ywa " + getAlgorytmInfo() + " na PreProcessing Obrazu Cyfrowego");
	}

	
	//Inne Metody Studenta 1, dotycz¹ce przetwarzania i analizy obrazu ...
	
}
