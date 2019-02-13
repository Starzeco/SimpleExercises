import java.util.Scanner;

public class Osoba {
private long pesel;
private String imieNazwisko;
private double waga;

public Osoba() {
	pesel=0;
	imieNazwisko="";
	waga=0.0;
	
}
public Osoba(long pesel,String imieNazwisko, double waga) {
	this.pesel=pesel;
	this.imieNazwisko=imieNazwisko;
	this.waga=waga;
}

public void czytaj() {
	Scanner sc = new Scanner(System.in);
	this.imieNazwisko = sc.nextLine();
	this.pesel= sc.nextLong();
	this.waga = sc.nextDouble();
	
}
public void drukuj() {
	System.out.println(pesel+ " " + imieNazwisko + " " + waga);
}

public double getWaga() {
	return waga;
}
}
