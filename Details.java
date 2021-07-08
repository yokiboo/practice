package search;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class Details {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
		File file = new File("C:\\Users\\yohes\\OneDrive\\Desktop\\employee.txt");
		BufferedReader read = new BufferedReader(new FileReader (file));
		
		
		for(int emp =0; emp<3; emp++) {
			payForFull(read);
			
		}
		for (int emp =3; emp<6; emp++) {
			payForPart(read, input);
		}
		input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void payForFull(BufferedReader red) {
		try {
		FulltimeEmployee fe = new FulltimeEmployee();
		fe.setfName(red.readLine());
		fe.setPosition(red.readLine());
		fe.setfPay(Double.parseDouble(red.readLine()));
		fe.fullPay();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	private static void payForPart(BufferedReader rea, Scanner sc) {
		try {
		ParttimeEmployee pe = new ParttimeEmployee();
		pe.setpName(rea.readLine());
		pe.setPosition(rea.readLine());
		pe.setpPay(Double.parseDouble(rea.readLine()));
		System.out.print("Hours worked? : ");
		double pay = sc.nextDouble();
		pe.partPay(pay);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	
			
		
		
	}
		
		
		
