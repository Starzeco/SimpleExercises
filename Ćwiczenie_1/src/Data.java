
public class Data {
	private int dzie�;
	private int miesi�c;
	
	public Data () {
		dzie�=1;
		miesi�c=1;
	}
	public Data ( int dzie�, int miesi�c) {
		this.dzie�=dzie�;
		this.miesi�c=miesi�c;
	}
	// metody @@@@@@@@@@@@@@@
	public int podajDzie�() {
		System.out.println("Dzie�=" +dzie�);
		return dzie�;
	}
	public int podajMiesi�c() {
		System.out.println("Miesi�c=" +miesi�c);
		return miesi�c;
	}
	public int dajLiczb�DniWMiesi�cu(int k) {
		
		if(k==1 || k==3 || k==5 || k==8 || k==10 || k==12) {
			return 31;}
		if(k==4 || k==6 || k==9 || k==11) {
			return 30;}
		else {
			return 28;}
		
		
		
	}
	
	public Data dajODzie�P�zniej() {
		int d=dzie�;
		int m=miesi�c;
		d++;
		if(d>dajLiczb�DniWMiesi�cu(m)) {
			d=1;
			m++;
			if(m>12) {
				m=1;
			}
		}
		return new Data(d,m);
		
	}
	public void setDzie�(int dzie�) {
		this.dzie�=dzie�;
		
	}
	public void setMiesi�c(int miesi�c) {
		this.miesi�c=miesi�c;
	}
	public Data dajONDniP�zniejsz�(int n) {
	 int d=dzie�;
	 int m=miesi�c;
	 int c=n+d;
	 
	 if(c<dajLiczb�DniWMiesi�cu(m)) {
		 c=d+n;
		 
	 }while(c>dajLiczb�DniWMiesi�cu(m)) {
		 c=c-dajLiczb�DniWMiesi�cu(m);
		 m++;
		 
	 }if(m>13) {
		 m=1;
	 }
	return new Data(c,m); 
	}
	
		
	

	public static void main(String[] args) {
		Data dataDomy�lna=new Data();
		dataDomy�lna.podajDzie�();
		dataDomy�lna.podajMiesi�c();
		
		Data imininy=new Data (14,11);
		imininy.podajDzie�();
		imininy.podajMiesi�c();
		
		imininy.dajODzie�P�zniej();
		Data studni�wka=imininy.dajODzie�P�zniej();
		studni�wka.podajMiesi�c();
		studni�wka.podajDzie�();
		
		Data impreza=new Data(11,6);
		impreza.podajDzie�();
		impreza.podajMiesi�c();
		Data imprezaPrzesuni�ta=impreza.dajODzie�P�zniej();
		imprezaPrzesuni�ta.podajDzie�();
		imprezaPrzesuni�ta.podajMiesi�c();
		Data nowaImpreza=impreza.dajONDniP�zniejsz�(50);
		nowaImpreza.podajDzie�();
		nowaImpreza.podajMiesi�c();
		
		
		// Ustaw sobie set i getery pozmieniaj daty w imininach :) 
		

	}

}
