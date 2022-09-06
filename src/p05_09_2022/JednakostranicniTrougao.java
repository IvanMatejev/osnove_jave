package p05_09_2022;

public class JednakostranicniTrougao extends Figura {
	private int a;

	public JednakostranicniTrougao( int a ) {
		super();
		this.a = a;
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public double povrsina() {
		// TODO Auto-generated method stub
		return (this.a * this.a)*1.73205 / 4;
	}

	@Override
	public double obim() {
		// TODO Auto-generated method stub
		return 3 * this.a;
	}
	
	
	
	
}
