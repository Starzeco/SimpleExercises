package lab1;

public class Zadani2 {
	public static double T(double a, double b) {
		double t;
		if(a>=b){
			t=2*a+Math.abs(b)-1;
		}else {
			t=Math.sin(a)-b*b;
		}
		return t;


		}
	public static void main(String[] args) {
			int a=3;
			int b=6;
			double T;
			if (a >= b) { 
				
				T=2*a+Math.abs(b)-1;
				System.out.println("T=" + T);}
				else { T=Math.sin(a)-b*b;
				System.out.println("T=" +T);
				
				}
			
	System.out.println(T(4,6));
	}
				

}


