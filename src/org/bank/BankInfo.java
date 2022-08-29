package org.bank;

public class BankInfo extends AxisBank{
	private void saving() {
		float a=22.7657f;
		System.out.println("savings is "+a);
		System.out.println("savings is "+a);
		System.out.println("savings is "+a);

	}
	private void fixed() {
		float a=46675.7657f;
		System.out.println("fixed is "+a);


	}
	public static void main(String[] args) {
		BankInfo a = new BankInfo();
		a.deposit();
		a.saving();
		a.fixed();
		
		
	}

}
