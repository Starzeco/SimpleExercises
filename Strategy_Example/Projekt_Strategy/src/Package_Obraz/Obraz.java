package Package_Obraz;

import Package_AlgObrazu.*;

abstract public class Obraz {
	
	// BufferedImage obr = null;
	//Konstruktor - tworzy obraz
	
	
	protected PrzetworzenieObrazu_PreProcessing PreProc;
	// Tworzy pole dla obiektu który bêdzie implementowaæ 
	private String AlgorytmInfo;
	
	
	
	//Metody wykonuj¹ce PreProcessing:____________________________ 
    public void WykonajPreProcessing(){
     
    	PreProc.SposobNaWykonaniePreProcessing();
    }

   //_________________________________________________________ 
    
    //Mo¿liwoœæ zmiany sposoby na wykonanie algorytmu PreProcessingu na 'bie¿¹co'
    public void UstawPreProcessing(PrzetworzenieObrazu_PreProcessing p, String AlgInfo){
     
    	this.PreProc = p;
    	
    	this.AlgorytmInfo = AlgInfo;
    }

    //__________________________________________________________
    
    
    
///////Inne Metody://///////////////////////////////////////
    
    abstract public void WyswietlInfo();
    	
    
    
	public void ZaladujObraz() {
		System.out.println("£adowanie obrazu");
	}
	
	public void ZapiszObraz() {
		System.out.println("Zapis obrazu do pliku");
	}
	
	//public void getImage(){ return obr; }
	
	
	public String getAlgorytmInfo() {
		return this.AlgorytmInfo;
	}
	
	
	public void setAlgorytmInfo(String s) {
		this.AlgorytmInfo = s;
	}	
	
/////////////////////////////////////////////////////////////
}