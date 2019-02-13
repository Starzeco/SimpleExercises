package Sposoby;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Sposob_na_pielegnacje1 implements Pielegnacja {
	ArrayList<String> listaOdzywek2;
	HashSet<String> listaOdzywek = new HashSet<String>(); //lista obiektow
	
	public String Sposob_na_pielegnacje() {
		pobierzOdzywki();
		listaOdzywek2=new ArrayList<String>(listaOdzywek);
		Collections.sort(listaOdzywek2);
		return "U¿ywaj tych od¿ywek: " + listaOdzywek2.toString();
}
	public void pobierzOdzywki() {
		try {
		File plik=new File("ListaOdzywek.txt");
		BufferedReader reader = new BufferedReader(new FileReader(plik));
		
		String wiersz=null;
		while ((wiersz= reader.readLine()) != null) {
				  dodajOdzywke(wiersz);
			}
			
			reader.close();
		
		}  catch(Exception ex) {
		      ex.printStackTrace();
		}
	}
	public void dodajOdzywke(String cos) {
		String [] elementy=cos.split("/");
		for(String Odzywka : elementy) {
			
			listaOdzywek.add(Odzywka);
			
		}
		
	}
	
 
}
