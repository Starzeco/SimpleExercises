package Rosliny;
import java.io.Serializable;

import Sposoby.Pielegnacja;
import Sposoby.Sposob_na_pielegnacje1;

public class Roslina implements Serializable {
	private int rozmiar;
	private String nazwa;  
	private boolean jadalna;
	private String rodzaj;
	private boolean liœcie;
	private int wiek;
	protected Pielegnacja mojSposobNaPielegnacje;
	
	
	public Roslina(String rodzaj, String nazwa, boolean jadalna, int rozmiar, boolean liœcie, int wiek)
	{
		this.rozmiar=rozmiar;
		this.nazwa=nazwa;
		this.jadalna=jadalna;
		this.rodzaj=rodzaj;
		this.liœcie=liœcie;
		this.wiek=wiek;
		
		mojSposobNaPielegnacje=new Sposob_na_pielegnacje1();
	} 
	public String wyœwietl() {
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
	public boolean getLiœcie() {
		return liœcie;
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
	public void setLiœcie(Roslina p) {
		this.liœcie=liœcie;
	}
	public void setWiek(Roslina p) {
		this.wiek=wiek;
	}
	public String toString() {
		return"Rodzja roœliny to"+" "+rodzaj+" "+"Nazwa roœliny to "+" "+nazwa+" "+"Czy ma liœcie "+" "+liœcie+" "+ "Rozmiar roœliny to"+ " " + rozmiar + " "  + "Czy roœlina jest jadalna?"+ " " + jadalna+" "+"Wiek roœliny to"+ " "+ wiek+" "+ wyœwietl()+ " ";
	}
	
	public String zbierzLiscie() {
		if(wiek>=1) {
			if(liœcie) {
				
					System.out.println("Zbierz Liœcie o kolorze ¿ó³tym, pomarañczowym lub czerwonym");
					return "Zbierz Liœcie o kolorze ¿ó³tym, pomarañczowym lub czerwonym";
				
			} else {
				System.out.println("Twoja roœlinka obumiera" );
				return "Twoja roœlinka obumiera" ;
			}
			}else {
				System.out.println("Liœcie dopiero rosn¹");
				return "Liœcie dopiero rosn¹";
			}
	}
}

