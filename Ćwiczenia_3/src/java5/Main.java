package java5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Toyota t1=new Toyota("Toyota",100,"Yaris",20);
		Toyota t2=new Toyota("Toyota",200,"Yaris",20);
		Toyota t3=new Toyota("Toyota",100,"Carina",15);
		Toyota t4=new Toyota("Toyota",200,"Carina",15);
		Trasa T=new Trasa("Toyota",200,"Carina",15,90);
		ArrayList<Auto> Wycieczka=new ArrayList<Auto>();
		Wycieczka.add(t1);
		Wycieczka.add(t2);
		Wycieczka.add(t3);
		Wycieczka.add(t4);
		Wycieczka.add(T);
		
		for (Auto i:Wycieczka) {
			System.out.println(i.toString());
		}
		System.out.println(Wycieczka.size());
		Opel o1=new Opel("Opel",100,"Astra",15);
		Wycieczka.add(2,o1);
		for(Auto i:Wycieczka) {
			System.out.println(i.toString());
		}
		if(Wycieczka.contains(t1)) {
			System.out.println("Jest");
			Wycieczka.remove(t1);
		}else {
			System.out.println("Brak");
		}
		/*String s="2+4*3/9-3";
		char [] c=s.toCharArray();
		for(char i:c) {
			System.out.println(i);
		}*/
		/*char p='+';
		if(Character.isLetter(p)) {
			System.out.println("Tak");
		}
		else {
			System.out.println("Nie");
		}*/
	}

}
