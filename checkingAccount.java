public class checkingAccount extends ACCOUNT {
    private int routingNumber;  
    private static final double MIN_BALANCE = 50.00; // Constant for minimum balance

    public checkingAccount(int accountNumber, double balance, int routingNumber) {
        super(accountNumber, balance); // Call to the superclass constructor
        this.routingNumber = routingNumber; // Set the routing number

        if (balance < MIN_BALANCE) {
            System.out.println("Minimal Account Balance allowed is " + MIN_BALANCE);
        }
    }

    // Getter for routingNumber
    public int getRoutingNumber() {
        return this.routingNumber;
    }

    // Setter for routingNumber
    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) { // Ensure the withdrawal still satisfies the minimum balance
            balance -= amount; // Deduct the amount from the total balance
            return true;
        } else {
            System.out.println("Invalid Withdrawal ... Minimal Balance limit: " + MIN_BALANCE);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Checking Account " + accountNumber + " Routing Number: " + routingNumber + " -- Account Balance: $" + balance;
    }
}

 
 

