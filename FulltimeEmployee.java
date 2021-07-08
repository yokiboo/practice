package search;

public class FulltimeEmployee extends Payroll {
	private String fname;
	private double fpay;
	
	public void setfName(String aname) {
		fname = aname;
	}
	public String getfName() {
		return fname;
	}
	public void setfPay(double apay) {
		fpay = apay;
	}
	public double getfPay() {
		return fpay;
	}
	public void fullPay() {
		System.out.printf("The weekely pay for %s is $%,.2f for the full time job\n",fname,fpay);
	}
	

}
