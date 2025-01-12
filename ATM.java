package atm;

import java.util.Scanner;

public class ATM {
	
	float Balance;
	int PIN = 4159;
	
	/*public void checkPin() {
		System.out.println("Enter yout PIN");
		Scanner s= new Scanner(System.in);
		int enteredpin= s.nextInt();
		
		if(enteredpin==PIN) {
			menu();
		}
		else {
			System.out.println("Entered PIN incorrect, please enter valid");
		}
		
	}  */
	
	ATM(float bal){
		this.Balance=bal;
		
		System.out.println("Enter yout PIN");
		Scanner s= new Scanner(System.in);
		int enteredpin= s.nextInt();
		
		if(enteredpin==PIN) {
			menu();
		}
		else {
			System.out.println("Entered PIN incorrect, please enter valid");
		}
	}
	
	public void menu() {
		System.out.println("Enter Your Choice:");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2) {
			withdrawMoney();
		}
		else if(opt==3) {
			depositMoney();
		}
		else if(opt==4) {
		   return ;
		}
		else {
			System.out.println("Enter a valid option");
		}
	}
	
		// Functions of all Options
		public void checkBalance() {
			System.out.println("Balance: "+ Balance);
			menu();
		}
		
		public void withdrawMoney() {
			
			System.out.println("Enter Amount to Withdraw: ");
			
			Scanner sc= new Scanner(System.in);
			float amount = sc.nextFloat();
			
			if (amount>Balance) {
				System.out.println("Insufficient Balance");
			}
			else {
				Balance =Balance-amount;
				System.out.println("Money Withdraw Successful");
			}
			menu();
		}
		
		public void depositMoney() {
			System.out.println("Enter the Amount:");
			Scanner sc = new Scanner(System.in);
			Float amount = sc.nextFloat();
			Balance= Balance + amount;
			System.out.println("Money Deposited Successfully");
			menu();
		}
		
		
	

}
