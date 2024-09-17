package oopconcepts;



public class MethodOverloading {
	public int add(int a,int b) {
		return a+b;
	}
	
	public float add(float a,float b,float c) {
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.add(5, 5));
		System.out.println(mo.add(1.2f,1.2f,1.2f));
		System.out.println(mo.add(2.5, 2.5));
	}
}
