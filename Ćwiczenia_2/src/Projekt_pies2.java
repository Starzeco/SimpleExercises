
public class Projekt_pies2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pies pies_domyslny = new Pies();
		
		System.out.println("Pies domyœlny : ");
		pies_domyslny.getStan();
		System.out.println(pies_domyslny.Szczeka());
		System.out.println(pies_domyslny.Aport(true) + "\n\n");
		
		
		Pies pies1 = new Pies(0.3f,"Owczarek",false);
		Pies pies2 = new Pies(3f,"Labrador",false);
		Pies pies3 = new Pies(2f, "Bokser",false);
		Pies pies4 = new Pies(5f, "Pitbull",true);
		
		
		pies3.getStan();
		System.out.println(pies3.Szczeka());
		System.out.println(pies3.Aport(true) + "\n\n");
		
		
		pies4.getStan();
		System.out.println(pies4.Szczeka());
		System.out.println(pies4.Aport(false) + "\n\n");
		
		//Zmiana stanu
		pies4.setCzyGrozny(false);
		pies4.getStan();
		System.out.println(pies4.Szczeka());
		
		//Kupujemy obroze
		pies4.ZakupObrozy(true, true, "czerwony");
		pies3.ZakupObrozy(false, false, "zielony");
		System.out.println(pies4.getObroza());	
		
		pies3.getObroza().getStan();
		
					
		
		if (pies3.getObroza() != null) {
			pies3.getStan();
			pies3.getObroza().getStan();
		}else {
			pies3.getStan();
			System.out.println("Kiepsko - brak obrozy");
		}
		
	
		
		try {
			
		pies3.getObroza().getStan();
		
		}catch(NullPointerException e){
			
			pies3.getStan();
			System.out.println("Kiepsko - brak obrozy");
		}
		

		System.out.println("\n\n Koniec Programu ...");
		
		
	}

}
