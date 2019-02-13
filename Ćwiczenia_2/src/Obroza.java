class Obroza{
	
	private boolean CzySkora;
	private boolean CzyPrzeciwKleszczom;
	private String kolor;
	
	public Obroza(boolean CzySkora, boolean CzyPrzeciwKleszczom, String kolor) {
		
		this.CzySkora = CzySkora;
		this.CzyPrzeciwKleszczom = CzyPrzeciwKleszczom;
		this.kolor = kolor;		
	}
		
	//Metody typu get
	public boolean getCzySkora() {
		return CzySkora;
	}
	
	public boolean getCzyPrzeciwKleszczom() {
		return CzyPrzeciwKleszczom;
	}
	
	public String getKolor() {
		return kolor;
	}	
	
	public void getStan() {
		System.out.println("Pies ! MA ! Obroze");
		System.out.println("CzySkora : " + getCzySkora() + "\t" + "CzyPrzeciwKleszczom : " 
	+ getCzyPrzeciwKleszczom() + "\t" + "Kolor :" + getKolor() + "\n\n");
	}
	//____________________________________________________________________________
	
	//Metody typu set
	public void setCzySkora(boolean CzySkora) {
		this.CzySkora = CzySkora;
	}
	
	public void setCzyPrzeciwKleszczom(boolean CzyPrzeciwKleszczom) {
		this.CzyPrzeciwKleszczom = CzyPrzeciwKleszczom;
	}
	
	public void setkolor(String kolor) {
		this.kolor = kolor;
	}	
	//____________________________________________________________________________
	
}