public class savingAccount extends ACCOUNT{
private int routingNumber;


public savingAccount (int accountNumber, double balance, int routingNumber){
super(accountNumber, balance);
this.routingNumber = routingNumber;

if(balance < MIN_BALANCE){
System.out.println("Minimal Account Balnace allowed is " + MIN_BALANCE);
 }
}
 public int getRoutingNumber(){
   return this.routingNumber;
     }
 public void setRoutingNumber(int routingNumber){
 this.routingNumber = routingNumber; 

 }
// withdraw method
public boolean withdraw(double amount){
 if (balance - amount >= MIN_BALANCE){ // will the withdarw still satfisy the min
 balance -= amount; // adds withdarw to total balance 
 return true;
 }else{
 System.out.println(" Invalid Withdarw ... Minimal Balance limit" + MIN_BALANCE);
 return false;
 }
}
// min balnace for account 
private static final double MIN_BALANCE = 50.00; // balance min limit

//routing number


@Override
 public String toString() {
 return "Saving Account " + accountNumber + " Routing Number " + routingNumber + " -- Account Balance: $" + balance ;
 }
}

