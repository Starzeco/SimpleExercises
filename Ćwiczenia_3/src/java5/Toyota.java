package java5;

public class Toyota extends Auto{
 protected String model;
 protected int zuz;
 
 public Toyota() {
	 super();
	 model="pop";
	 zuz=4;
 }
 public Toyota (String marka, int lk, String model,int zuz) {
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
