import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		double temp=Double.MAX_VALUE;
		
		Pracownik [][] tab=new Pracownik[3][10];
		 Scanner in = new Scanner(System.in);
		int liczbaOb=in.nextInt();
		//int pesel,int stawka,int etat, int premia
		int pesel=in.nextInt();
		int stawka=in.nextInt();
		int etat=in.nextInt();
		int premia=in.nextInt();
		Prezes pan=new Prezes(pesel,stawka,etat,premia);
		tab[0][0]=pan;
		//int pesel,int stawka,int etat
		for(int i=1;i<=liczbaOb;i++) {
			int pesel1=in.nextInt();
			int stawka1=in.nextInt();
			int etat1=in.nextInt();
			PracownikEtat e=new PracownikEtat(pesel1,stawka1,etat1);
			tab[1][i]=e;
		}
		//int pesel,int stawka,int lg
		for(int i=1;i<=liczbaOb;i++) {
			int pesel2=in.nextInt();
			int stawka2=in.nextInt();
			int lg=in.nextInt();
			PracownikGodz g=new PracownikGodz(pesel2,stawka2,lg);
			tab[2][i]=g;
		}
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				if(tab[i][j]!=null) {
				System.out.println(tab[i][j].toString());
				}
			}
		}
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				if(tab[i][j]!=null) {
					if(tab[i][j].Pensja()<temp) {
						temp=tab[i][j].Pensja();
						System.out.println(tab[i][j].toString());
					}
				}
			}
			
		}
		
		File plik = new File("hejka.txt");
		BufferedWriter w = new BufferedWriter(new FileWriter(plik));
		w.write("asdasd");
		/*for(int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++) {
				if(tab[i][j]!=null) {
					writer.write("sadas");
					
				}
			}
		}
		/*for(Pracownik[] i:tab) {
			for(Pracownik k:i) {
				if(k!=null) {
					writer.write(k.toString());
				}
			}
			
		}*/
	}

}
