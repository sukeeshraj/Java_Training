package com.nttdata.interfaces;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		Account a = new Account("101",15000);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bank Name => ");
		String name = sc.next();
		System.out.print("Bank IFSC => ");
		int ifsc = sc.nextInt();
		System.out.print("Bank Type => ");
		String type = sc.next();
		System.out.print("Bank Intrest => ");
		double roi = sc.nextDouble();
		
		PublicBank pb = new PublicBank(name,ifsc,type,roi,a);
		pb.displayBank(pb);
		
		System.out.println();
		System.out.println("============================");
		System.out.println("Intrest Calculation => ");
		System.out.println("============================");
		
		pb.CalculateIntrest();
		
		System.out.println();
		System.out.println("============================");
		
		System.out.print("Bank Name => ");
		String name1 = sc.next();
		System.out.print("Bank IFSC => ");
		int ifsc1 = sc.nextInt();
		System.out.print("Bank Type => ");
		String type1 = sc.next();
		System.out.print("Bank Intrest => ");
		double roi1 = sc.nextDouble();
		
		
		
		PrivateBank pbv = new PrivateBank(name1,ifsc1,type1,roi1,a);
		pbv.displayBank(pbv);
		
		System.out.println();
		System.out.println("============================");
		System.out.println("Intrest Calculation => ");
		System.out.println("_____________________________");
		pbv.CalculateIntrest();
	}

}
