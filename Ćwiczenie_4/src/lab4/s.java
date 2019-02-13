package lab4;
import java.util.Scanner;
public class s {
	private int nr_konta;
	private String imieInazwisko;
	private double saldo;
	
	// konstruktory ------------------
	public s(){
		this.nr_konta=0;
		this.imieInazwisko="brak";
		this.saldo=0.0;
	}//koniec domyslnego
	
	public s(int nr, String imie, double saldo) {
		this.imieInazwisko=imie;
		this.nr_konta=nr;
		this.saldo=saldo;
	}//koniec przeciazonego
	Scanner sc = new Scanner(System.in);
	public void czytaj() {
		
		this.imieInazwisko = sc.nextLine();
		this.nr_konta= sc.nextInt();
		this.saldo = sc.nextDouble();
		sc.close();
	}//koniec czytaj
	
	public void drukuj() {
		System.out.println(imieInazwisko + " "+ nr_konta+ " " + saldo +" ");
	}//koniec drukuj
	
	public double dajSaldo() {return saldo;}

}
