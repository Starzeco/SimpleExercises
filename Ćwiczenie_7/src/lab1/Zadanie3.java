package lab1;

public class Zadanie3 {
	public static double f(double x) {
		double f=0;
		
		
		
		if(x<=0) {
			f=4.0/5;
			
			
			
			
					
		}
		else if(0<x&&x<1) {
			f=x*x+Math.cos(x);
		} 
		else if(x>=1){
			f=1;
			
		}
		return f;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("f=" +f(1));

	}

}
