class Pies{
	
	//Sk³adowe klasy
	private float wiek;
	private String rasa;
	private boolean CzyGrozny;
	
	private Obroza obr = null;
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
	
	
	public void getStan() {
		System.out.println("Wiek : " + getWiek() + "\t" + "Rasa : " 
	+ getRasa() + "\t" + "Czy Grozny ? :" + getCzyGrozny());
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
	
	
	//Obroza (set-er)
	public void ZakupObrozy(boolean CzySkora, boolean CzyPrzeciwKleszczom, String kolor) {
		
		this.obr = new Obroza(CzySkora, CzyPrzeciwKleszczom, kolor);

	}
	//_____________________________________________________________
	
	//Obroza get-er
	public Obroza getObroza() {
		return this.obr;
	}
	//_____________________________________________________________


}