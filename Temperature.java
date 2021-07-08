package search;

public class Temperature {
	private double number;
	private TempScale scale;
	
	public Temperature() {
		number = 0.00;
		scale = TempScale.FAHRENHEIT;
	}
	public Temperature(double number) {
		this.number = number;
		scale = TempScale.FAHRENHEIT;
	}
	public Temperature (TempScale scale) {
		number = 0.00;
		this.scale = scale;
	}
	public Temperature (double number, TempScale scale) {
		this.number = number;
		this.scale = scale;
	}
	
	public void setNumber(double numb) {
		number = numb;
	}
	public double getNumber() {
		return number;
	}
	public void setTemp(TempScale scal) {
		scale = scal;
	}
	public TempScale getTemp() {
		return scale;
	}

}
