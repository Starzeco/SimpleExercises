package java5;

public class Opel extends Auto {
 private String model;
 private int zuz;
 
 public Opel() {
	 super();
	 model="lol";
	 zuz=34;
 }
 public Opel(String marka,int lk, String model, int zuz) {
	 super(marka,lk);
	 this.model=model;
	 this.zuz=zuz;
	 
 }

public int IlePaliwa() {
	return lk/zuz;
}
public String toString() {
	return super.toString()+" "+model+" "+IlePaliwa()+" "+lk;
}
 
}
