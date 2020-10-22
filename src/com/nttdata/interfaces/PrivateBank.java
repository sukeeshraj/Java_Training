package com.nttdata.interfaces;

import java.util.Scanner;

public class PrivateBank extends Bank implements Rbi{

	
	private String bankType;
	private double intrest;
	Account acc;

	
	

	public PrivateBank(String bankName, int iFSC, String bankType, double intrest,Account acc) {
		super(bankName, iFSC);
		this.bankType = bankType;
		this.intrest = intrest;
		this.acc = acc;
	}


	

	public String getBankType() {
		return bankType;
	}




	public void setBankType(String bankType) {
		this.bankType = bankType;
	}




	public double getIntrest() {
		return intrest;
	}




	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}




	@Override
	public void CalculateIntrest() {
		System.out.println("Rate of Intrest => "+intrest);
		System.out.println("Account ID => "+acc.accId+"\n"+"Account Balance => "+acc.accBalance);
		System.out.print("Enter the Years => ");
		Scanner sc = new Scanner(System.in);
		float y = sc.nextFloat();
		double si = (acc.accBalance*intrest*y)/100;
		System.out.println("intrest for "+y+" years is => "+si);
	}

}
