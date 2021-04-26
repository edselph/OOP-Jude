public class customer{
// name string user F,M,L and Account
  private String FName;
  private String MName;
  private String LName;
  private Account account;

  public customer (String i,String f, String j){
    this.FName = i;
    this.MName = f;
    this.LName = j;
    this.account = new Account(0);
  }
  
  public String firstName(){
    return this.FName;
  }

  public String MindleName(){
    return this.MName;
  }

  public String LastName(){
    return this.LName;
  }
  
  public Account UserAccount(){
    return (Account) this.account;
  }

  public Account getAccount(){
    return account;
  }
  public void setAccount(Account account){
    this.account = account;
  }
}
