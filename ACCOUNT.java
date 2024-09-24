/*
Fernando Ruiz Palma 
CS 2050 
Description:
Account program that is a manageable simulation of a bank
*/
public class ACCOUNT {

protected int accountNumber; 
protected double balance;

public ACCOUNT(int accountNumber,double balance) {
this.accountNumber = accountNumber;
this.balance = balance;
 }
 // get account number 
 public int getAccountNumber() {
  return accountNumber;
  }
  // get balance 
  public double getBalance() {
	  return balance;
	  }
     
     // set 
   public void setAccountNumber(int accountNumber){
      this.accountNumber = accountNumber; 
   }
   // set 
   public void setBalance(double balance){
   this.balance = balance;
   }
	// Depoist amount method
	public void deposit(double amount) {
	if (amount > 0){ //checks if amount is positive 
	this.balance += amount; //adds the deposit amount to the current balance of the account
	}else{
	System.out.println(" Invalid Deposit Amount ... Please Try Again ");
	  }
	}
	public String toString(){
      return "Account Number" + accountNumber + " Balance " + balance;

   } 
	  
}