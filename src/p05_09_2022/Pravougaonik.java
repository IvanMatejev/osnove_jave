package p05_09_2022;

public class Pravougaonik extends Figura {
	private double a;
	private double b;
	public Pravougaonik( double a, double b) {
		super();
		this.a = a;
		this.b = b;
		// TODO Auto-generated constructor stub
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	@Override
	public double povrsina() {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public double obim() {
		// TODO Auto-generated method stub
		return 2*this.a + 2*this.b;
	}
	
	
	
	
	
}
