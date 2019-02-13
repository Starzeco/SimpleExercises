package Ogrodnik;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.*;



import Rosliny.Roslina;
import Sposoby.Sposob_na_pielegnacje1;
import Sposoby.Sposob_na_pielegnacje2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.*;

public class Ogrodnik implements Serializable{
private Roslina [] roslinki;
	
	
	public Ogrodnik(int rozmiar) {
	roslinki=new Roslina[rozmiar];

}
public boolean dodajRosline(Roslina p) { 
	for(int i=0; i<roslinki.length;i++) {
		if(roslinki[i]==null) {
			roslinki[i]=p;
			return true;
		}
	}return false;
}
 
public String wyswietlRoslinkireturn() {
	StringBuilder lista=new StringBuilder();
	for(int i=0; i<roslinki.length;i++) {
		if(roslinki[i]!=null) {
			lista.append(roslinki[i].toString());
			lista.append("\n");
			
		}
	}return lista.toString();
}


public void usunRoslinke(String nazwa) {
	for(int i=0;i<roslinki.length;i++) {
		if(roslinki[i]!=null) {
			if(roslinki[i].getNazwa().equals(nazwa)) {
				roslinki[i]=null;
			}
		}
	}
}

public Roslina czyJestRoslina(String nazwa) {
	for(int i=0;i<roslinki.length;i++) {
		if(roslinki[i]!=null) {
			
				if(roslinki[i].getNazwa().equals(nazwa)) {
					return roslinki[i];
				
			}
		}
	}return null;
}

public String pielegnacja() {
	StringBuilder lista=new StringBuilder();
	for(int i=0;i<roslinki.length;i++) {
		if(roslinki[i]!=null) {
			lista.append(roslinki[i].getNazwa()+" "+roslinki[i].wyœwietl());
			lista.append("\n");
		}
		}return lista.toString();
}
public String czyZebracLiscie() {
	StringBuilder lista=new StringBuilder();
	for(int i=0;i<roslinki.length;i++) {
		if(roslinki[i]!=null) {
			lista.append(roslinki[i].zbierzLiscie());
			lista.append("\n");
		}
	}return lista.toString();
}
public String czyZebracLiscie2(String nazwa) {
	for(int i=0;i<roslinki.length;i++) {
		if(roslinki[i]!=null) {
			if(roslinki[i].getNazwa().equals(nazwa)) {
				return roslinki[i].zbierzLiscie();
			}
		}
	}return "Nie ma takiej roœlinki";
}
public boolean czyIstnieje(String nazwa) {
	for(int i=0;i<roslinki.length;i++) {
		if(roslinki[i]!=null) {
			if(roslinki[i].getNazwa().equals(nazwa)) {
				return true;
			}
		}
	}return false;
}
	public void Odczytx2() {
		try {
			File plik = new File("Paprocie.txt");
			BufferedReader reader = new BufferedReader(new FileReader(plik));
			 String wiersz = null;
			 while ((wiersz= reader.readLine()) != null) {
		    	  dodajPaproc(wiersz);
		      }
		      
		      reader.close();
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}
	public void dodajPaproc(String k) {
		String [] elementy=k.split("/");
		Roslina nastepnapaproc=new Roslina(elementy[0],elementy[1],Boolean.valueOf(elementy[2]),Integer.parseInt(elementy[3]),Boolean.valueOf(elementy[4]),Integer.parseInt(elementy[5]));
		dodajRosline(nastepnapaproc);
	}

	
	public void wczytajx2() {
		Odczytx2();
		
	}
	public void zapiszP() {
		try{
			File plik = new File("Paprocie.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(plik));
			for(Roslina i : roslinki) {
				if(i!=null) {
					writer.write(i.getRodzaj()+"/"+i.getNazwa()+"/"+i.getJadalna()+"/"+i.getRozmiar()+"/"+i.getLiœcie()+"/"+i.getWiek());
					writer.write(System.lineSeparator());
				}
			}
			writer.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void zapiszx2() {
		
		zapiszP();
	}
	public void wyczysc() {
		for(int i=0;i<roslinki.length;i++) {
			if(roslinki[i]!=null) {
			roslinki[i]=null;
			}
		}
	}
}
