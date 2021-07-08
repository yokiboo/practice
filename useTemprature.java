package search;

public class useTemprature {

	public static void main(String[] args) {
		
		TemperatureNice temp = new TemperatureNice();
		
		temp.setNumber(30);
		temp.setTemp(TempScale.CELCIUS);
		temp.display();
		
		temp = new TemperatureNice(30);
		temp.display();
		temp = new TemperatureNice(TempScale.FAHRENHEIT);
		temp.display();
		
		temp = new TemperatureNice(55,TempScale.KELVIN);
		temp.display();

	}

}
