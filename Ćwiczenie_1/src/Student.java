
public class Student {
	// definiuje zmienne u¿yte w klasie
	private static int wiedza;
	private static int skakanie;
	
	//próba
	private Obroza2 obr = null;
	
	// konstruktor
	public Student (int wiedza, int skakanie) {
		this.wiedza=wiedza;
		this.skakanie=skakanie;
		// metody
		
	}
     public void uczSiê() {
    	 wiedza+=3;
    	 skakanie-=2;
    	 
    	 
     }
     public int cwiczenia() {
    	skakanie+=4;
    			return skakanie;
     }
     public int imprezuj() {
    	 wiedza-=3;
    	 return wiedza;
    			
     }
     // geterki 
     public int getWiedza() {
    	 return wiedza;
     }
     public int getSkakanie() {
    	 return skakanie;
     }
     public void getStan() {
    	 System.out.println("Wiedza=" + getWiedza() + "\t" + "Skakanie=" + getSkakanie());
     }
     // seterki
     public void setWiedza(int wiedza) {
    	 this.wiedza=wiedza;
    	 
     }
     public void setSkakanie(int skakanie) {
    	 this.skakanie=skakanie;
     }
     
     // ci¹g dalszy o obro¿y 
     public void zakupObrozy(boolean CzySkora, boolean CzyPrzeciwKleszczom, String kolor) {
    	 this.obr= new Obroza2(CzySkora, CzyPrzeciwKleszczom, kolor);
    	 
     }
     public Obroza2 getObroza() {
    	 return this.obr;
     }
     
     
    	 
    			 
    	
    	 
    	
    	 // jednostka wykonawcza i przywo³uj¹ca metody i miejsce do robienia obiektów 
    	 
    	public static void main(String[] args) {
		Student maciek=new Student(13,8);
		maciek.cwiczenia();
		maciek.uczSiê();
		
		maciek.getStan();
		maciek.setWiedza(90);
		maciek.getStan();
		while(wiedza<=120) {
			maciek.uczSiê();
			
			
	    	 
	     }
		maciek.getStan();
		while(skakanie<=20) {
			maciek.cwiczenia();
			
		}
		maciek.getStan();
		Student romek=new Student(80,2);
		while(wiedza>=30) {
			romek.imprezuj();
			
		}
		while(skakanie<=50) {
			romek.cwiczenia();
		}
		romek.getStan();
		romek.setWiedza(30);
		romek.getStan();
		
		// obroza 
		romek.zakupObrozy(true,false,"czerwony");
		romek.getObroza().getStan();
		
		
		
		
		
		

	}

}
