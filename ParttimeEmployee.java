package search;

public class ParttimeEmployee extends Payroll {
	private String pname;
	private double ppay;
	
	public void setpName(String aname) {
		pname = aname;
	}
	public String getpName() {
		return pname;
	}
	public void setpPay(double apay) {
		ppay = apay;
	}
	public double getpPay() {
		return ppay;
	}
	public void partPay(double hour) {
		double total = ppay * hour;
		System.out.printf("The pay for %s for his/her %.0f hours of work is %,.2f\n",pname,hour,total);
	}

}
