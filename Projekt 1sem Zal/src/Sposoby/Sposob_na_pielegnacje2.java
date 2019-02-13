package Sposoby;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Sposob_na_pielegnacje2 implements Pielegnacja {
	HashSet<String> listaOdzywek2=new HashSet<String>();
	ArrayList<String> listaOdzywek3;
	
	public String Sposob_na_pielegnacje() {
		 		pobierzOdzywki();
		 		listaOdzywek3=new ArrayList<String>(listaOdzywek2);
				Collections.sort(listaOdzywek3);
				return "U¿ywaj tych od¿ywek: " + listaOdzywek3.toString();
	}
	public void pobierzOdzywki() {
		try {
		File plik=new File("ListaOdzywek2.txt");
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
			
			listaOdzywek2.add(Odzywka);
			
		}
		
	}
}


