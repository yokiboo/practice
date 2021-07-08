package search;
import static java.lang.System.out;

public class Payroll {
	private String name;
	private String position;
	
	public void setName(String aname) {
		name = aname;
	}
	public String getName() {
		return name;
	}
	public void setPosition(String posi) {
		position = posi;
	}
	public String getPosition() {
		return position;
	}
	
	public void cutCheck(double amount) {
		out.printf("%s is the %s of the company $ %.2f is the salary\n",name, position,amount );
	}
	

}
