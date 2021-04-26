import java.util.ArrayList;

public class bank26{
  private ArrayList<customer> Customer;
  private int customerscount;
  private String bankname;

  public bank26(String Bname){
    this.bankname = Bname;
    this.customerscount = 0;
    this.Customer = new ArrayList<customer>();
  }

  public String getbankname(){
    return bankname;
  }

  public void AddCus(String i,String f,String j){
    this.customerscount++;
    customer newCustomer = new customer(i, f, j);
    Customer.add(newCustomer);
  }
    public int getnumofcustomer(){
      return this.customerscount;
  }

  public customer getCustomer(int index){
    return Customer.get(index);
  }
}
