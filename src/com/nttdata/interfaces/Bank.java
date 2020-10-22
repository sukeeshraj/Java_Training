package com.nttdata.interfaces;

import java.util.Scanner;

public abstract class Bank {
	private String BankName;
	private int IFSC;
	
	Scanner sc = new Scanner(System.in);
	
	public Bank(String bankName, int iFSC) {
		super();
		BankName = bankName;
		IFSC = iFSC;
		
		
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public int getIFSC() {
		return IFSC;
	}

	public void setIFSC(int iFSC) {
		IFSC = iFSC;
	}
	
	
	
	void displayBank(Bank b)
	{
		if(b instanceof PublicBank)
		{
			PublicBank p = (PublicBank)b;
			System.out.println("-----------------------");
			System.out.println("Bank Details are : ");
			System.out.println("-----------------------");
			System.out.println("name =>"+p.getBankName());
			System.out.print("interest => "+p.getIntrest());
			

		}
		else
		{
			PrivateBank pr = (PrivateBank)b;
			System.out.println("Bank Details are : ");
			System.out.println("name =>"+pr.getBankName());
			System.out.print("interest => "+pr.getIntrest());
		}
	}
}
