 public class AccountTest {
 
   public static void main (String[] args) {
      ACCOUNT a = new ACCOUNT(2456, 100.00); 
      System.out.println(a.toString());
      
      a.deposit(300.00);
      System.out.println(a);
      
      savingAccount sa = new savingAccount(1256,350.00, 938474 );
      System.out.println(sa.toString());
      
      checkingAccount ca = new checkingAccount(3456, 400.00, 748949);
      System.out.println(ca.toString());
  }
 }