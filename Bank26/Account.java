public class Account{
  
  private double balance;

  public Account(double balance){
      this.balance = balance;
  }

  public double getbalance(){
    return this.balance;
  }
  // the main methods
  public boolean deposit(double amt){
    if (amt > 0){
      this.balance += amt;
      return true;
    }
      else{
        return false;
      }
  }
  public boolean withdraw(double amount){
    if (amount > 0){
        if (this.balance >= amount){
            this.balance -= amount;
            return true;
        } 
        else{
            return false;
        }
    }
    else{
        return false;
    }
}
}