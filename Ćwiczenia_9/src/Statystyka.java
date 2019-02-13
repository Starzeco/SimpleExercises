
public class Statystyka {
	private int n;
	private Osoba[] tab;
	
	public Statystyka() {
		n=0;
		tab=null;
	}
	public Statystyka(int n) {
		this.n=n;
		tab=new Osoba[n];
		for(int i=0; i<tab.length; i++) {
			tab[i]=new Osoba();
			tab[i].czytaj();
		}
	}
		public void wyswietlKlientow() {
			for (int i=0; i<tab.length; i++) {
				tab[i].drukuj();
				System.out.println(" ");
				
		}
			
		}
		public int maksWaga() {
			int temp=Integer.MIN_VALUE;
			int k=0;
			for(int i=0; i<tab.length; i++)
				if(temp<=tab[i].getWaga()) {
					temp=(int)tab[i].getWaga();
					
					
				}
			for(int i=0; i<tab.length; i++) {
				if(temp==(int)tab[i].getWaga()) {
					System.out.print(temp);
					k++;
				}
			}return k;
		}
		
	}
	

