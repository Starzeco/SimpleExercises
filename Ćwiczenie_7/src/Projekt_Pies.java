

class Pies{
	
	//Sk³adowe klasy
	private float wiek;
	private String rasa;
	private boolean CzyGrozny;
	//__________________________
	
	//Konstruktor domyœlny:
	public Pies() {
		
		wiek = 0.1f;
		rasa = "Labrador";
		CzyGrozny = false;
	}
	//__________________________
	
	//Konstruktor przeci¹¿ony:
	public Pies(float wiek, String rasa, boolean CzyGrozny) {
		
		this.wiek = wiek;
		this.rasa = rasa;
		this.CzyGrozny = CzyGrozny;
		
		//nie zajmujemy siê teraz referencj¹ 'this'
	}
	//___________________________________________________________
	
	//Metody klasy:
	public String Szczeka() {
		
		if (CzyGrozny) return "Agresywne szczekanie ...";
		else return "Normalne szczekanie ...";
	}
	
	public String Aport(boolean T) {
		
		if (T) return "Potrafi aportowaæ...";
		else return "Nie potrafi aportowaæ...";
	}
	
	//metody typu get (Pozyskanie stanu obiektu)
	public float getWiek() {
		return wiek;
	}
	
	public String getRasa() {
		return rasa;
	}
	
	public boolean getCzyGrozny() {
		return CzyGrozny;
	}
	
	
	public String toString() {
		 return "Wiek : " + getWiek() + "\t" + "Rasa : " 
	+ getRasa() + "\t" + "Czy Grozny ? :" + getCzyGrozny();
	}
	
	//____________________________________________________________
	
	//metody typu set (Zmiana stanu obiektu)
	public void setWiek(float wiek) {
		this.wiek=wiek;
	}
	
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	
	public void setCzyGrozny(boolean CzyGrozny) {
		this.CzyGrozny=CzyGrozny;
	}
	//_____________________________________________________________
}


public class Projekt_Pies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pies pies_domyslny = new Pies();
		
		System.out.println("Pies domyœlny : ");
		System.out.println(pies_domyslny.Szczeka());
		System.out.println(pies_domyslny.Aport(true) + "\n\n");
		
		
		Pies pies1 = new Pies(0.3f,"Owczarek",false);
		Pies pies2 = new Pies(3f,"Labrador",false);
		Pies pies3 = new Pies(2f, "Bokser",false);
		Pies pies4 = new Pies(5f, "Pitbull",true);
		
		
		System.out.println(pies3);
		System.out.println(pies3.Szczeka());
		System.out.println(pies3.Aport(true) + "\n\n");
		
		
	System.out.println(pies4);
		System.out.println(pies4.Szczeka());
		System.out.println(pies4.Aport(false) + "\n\n");
		
		//Zmiana stanu
		pies4.setCzyGrozny(false);
		System.out.println(pies4);
		System.out.println(pies4.Szczeka());
	}

}
