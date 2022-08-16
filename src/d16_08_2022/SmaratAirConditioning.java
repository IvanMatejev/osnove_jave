package d16_08_2022;

public class SmaratAirConditioning {
	
	public String mark;
	public double temp;
	public String mode;
	
	public void print() {
		System.out.println("Mark: " + this.mark + ", " + "Temp: " + this.temp + ", " + "Mode:" + this.mode);
	}
	
	public boolean razlika ( int outsideTemp) {
		return outsideTemp < this.temp;
	}

}
