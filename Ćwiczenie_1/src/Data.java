
public class Data {
	private int dzieñ;
	private int miesi¹c;
	
	public Data () {
		dzieñ=1;
		miesi¹c=1;
	}
	public Data ( int dzieñ, int miesi¹c) {
		this.dzieñ=dzieñ;
		this.miesi¹c=miesi¹c;
	}
	// metody @@@@@@@@@@@@@@@
	public int podajDzieñ() {
		System.out.println("Dzieñ=" +dzieñ);
		return dzieñ;
	}
	public int podajMiesi¹c() {
		System.out.println("Miesi¹c=" +miesi¹c);
		return miesi¹c;
	}
	public int dajLiczbêDniWMiesi¹cu(int k) {
		
		if(k==1 || k==3 || k==5 || k==8 || k==10 || k==12) {
			return 31;}
		if(k==4 || k==6 || k==9 || k==11) {
			return 30;}
		else {
			return 28;}
		
		
		
	}
	
	public Data dajODzieñPózniej() {
		int d=dzieñ;
		int m=miesi¹c;
		d++;
		if(d>dajLiczbêDniWMiesi¹cu(m)) {
			d=1;
			m++;
			if(m>12) {
				m=1;
			}
		}
		return new Data(d,m);
		
	}
	public void setDzieñ(int dzieñ) {
		this.dzieñ=dzieñ;
		
	}
	public void setMiesi¹c(int miesi¹c) {
		this.miesi¹c=miesi¹c;
	}
	public Data dajONDniPózniejsz¹(int n) {
	 int d=dzieñ;
	 int m=miesi¹c;
	 int c=n+d;
	 
	 if(c<dajLiczbêDniWMiesi¹cu(m)) {
		 c=d+n;
		 
	 }while(c>dajLiczbêDniWMiesi¹cu(m)) {
		 c=c-dajLiczbêDniWMiesi¹cu(m);
		 m++;
		 
	 }if(m>13) {
		 m=1;
	 }
	return new Data(c,m); 
	}
	
		
	

	public static void main(String[] args) {
		Data dataDomyœlna=new Data();
		dataDomyœlna.podajDzieñ();
		dataDomyœlna.podajMiesi¹c();
		
		Data imininy=new Data (14,11);
		imininy.podajDzieñ();
		imininy.podajMiesi¹c();
		
		imininy.dajODzieñPózniej();
		Data studniówka=imininy.dajODzieñPózniej();
		studniówka.podajMiesi¹c();
		studniówka.podajDzieñ();
		
		Data impreza=new Data(11,6);
		impreza.podajDzieñ();
		impreza.podajMiesi¹c();
		Data imprezaPrzesuniêta=impreza.dajODzieñPózniej();
		imprezaPrzesuniêta.podajDzieñ();
		imprezaPrzesuniêta.podajMiesi¹c();
		Data nowaImpreza=impreza.dajONDniPózniejsz¹(50);
		nowaImpreza.podajDzieñ();
		nowaImpreza.podajMiesi¹c();
		
		
		// Ustaw sobie set i getery pozmieniaj daty w imininach :) 
		

	}

}
