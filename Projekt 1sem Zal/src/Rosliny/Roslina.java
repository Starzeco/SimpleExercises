package Rosliny;
import java.io.Serializable;

import Sposoby.Pielegnacja;
import Sposoby.Sposob_na_pielegnacje1;

public class Roslina implements Serializable {
	private int rozmiar;
	private String nazwa;  
	private boolean jadalna;
	private String rodzaj;
	private boolean li�cie;
	private int wiek;
	protected Pielegnacja mojSposobNaPielegnacje;
	
	
	public Roslina(String rodzaj, String nazwa, boolean jadalna, int rozmiar, boolean li�cie, int wiek)
	{
		this.rozmiar=rozmiar;
		this.nazwa=nazwa;
		this.jadalna=jadalna;
		this.rodzaj=rodzaj;
		this.li�cie=li�cie;
		this.wiek=wiek;
		
		mojSposobNaPielegnacje=new Sposob_na_pielegnacje1();
	} 
	public String wy�wietl() {
		return mojSposobNaPielegnacje.Sposob_na_pielegnacje();
	}
	
	public void zmienSposob(Pielegnacja k) {
		this.mojSposobNaPielegnacje=k;
	}
	
	public int getRozmiar() {
		return rozmiar;
	}
	public String getNazwa() {
		return nazwa;
	}
	public boolean getJadalna() {
		return jadalna;
	}
	public String getRodzaj() {
		return rodzaj;
	}
	public boolean getLi�cie() {
		return li�cie;
	}
	public int getWiek() {
		return wiek;
	}
	public void setRozmiar(Roslina p) {
		this.rozmiar=rozmiar;
	}
	public void setNazwa(Roslina p) {
		this.nazwa=nazwa;
	}
	public void setJadalna(Roslina p) {
		this.jadalna=jadalna;
	}
	public void setRodzaj(Roslina p) {
		this.rodzaj=rodzaj;
	}
	public void setLi�cie(Roslina p) {
		this.li�cie=li�cie;
	}
	public void setWiek(Roslina p) {
		this.wiek=wiek;
	}
	public String toString() {
		return"Rodzja ro�liny to"+" "+rodzaj+" "+"Nazwa ro�liny to "+" "+nazwa+" "+"Czy ma li�cie "+" "+li�cie+" "+ "Rozmiar ro�liny to"+ " " + rozmiar + " "  + "Czy ro�lina jest jadalna?"+ " " + jadalna+" "+"Wiek ro�liny to"+ " "+ wiek+" "+ wy�wietl()+ " ";
	}
	
	public String zbierzLiscie() {
		if(wiek>=1) {
			if(li�cie) {
				
					System.out.println("Zbierz Li�cie o kolorze ��tym, pomara�czowym lub czerwonym");
					return "Zbierz Li�cie o kolorze ��tym, pomara�czowym lub czerwonym";
				
			} else {
				System.out.println("Twoja ro�linka obumiera" );
				return "Twoja ro�linka obumiera" ;
			}
			}else {
				System.out.println("Li�cie dopiero rosn�");
				return "Li�cie dopiero rosn�";
			}
	}
}

