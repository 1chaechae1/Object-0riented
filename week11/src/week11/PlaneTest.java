package week11;
class Plane{
	private int num, p_num;
	private String model;
	private static int planes;
	public void setNum(int n){
		num = n;
	}
	public void setPnum(int pn){
		p_num = pn;
	}
	public void setModel(String m){
		model = m;
	}
	public int getNum(){
		return num;
	}
	public int getPnum(){
		return p_num;
	}
	public String getModel(){
		return model;
	}
	public static void setPlanes(int p){
		planes = p;
	}
	public static int getPlanes(){
		return planes;
	}
	public Plane(){	}
	public Plane(int n, String m, int pn){
		num = n;
		p_num = pn;
		model = m;
	}
	public Plane(int n, String m){
		num = n;
		model = m;
	}
	public String toString(){
		return "?ĺ???ȣ :" + getNum() + "\t???? : " 
	    + getModel() + "\t\t?°??? : " + getPnum();
	}
}

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane(1, "aa", 200);
		Plane plane2 = new Plane(2, "bb");
		Plane plane3 = new Plane();
		plane1.setPlanes(0);
		plane1.getPlanes();
		plane3.setNum(3);
		plane3.setModel("cc");
		plane3.setPnum(150);		
		System.out.println(plane1);
		System.out.println(plane2);
		System.out.println(plane3);
	}
}
