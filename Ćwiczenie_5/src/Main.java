
public class Main {

	public static void main(String[] args) {
		Pokoj pokoj=new Pokoj(5.0,4.0,30.4);
		pokoj.toString();
		System.out.println(pokoj.toString());
		Pietro pietro=new Pietro(4, 5.3 , 3.0, 40.0);
		pietro.toString();
		System.out.println(pietro.toString());
		Pietro lol=new Pietro(pietro);
		lol.toString();
		System.out.println(lol.toString());
	}

}
