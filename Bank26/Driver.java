import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    bank26 Bank26 = new bank26("bank26");
    System.out.println("Wellcome to Bank26");
    System.out.println("---------------------------------");
// menu looop
    while(true){
      menu();
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();
      // enter name
      switch (choice){
        case 1:
          System.out.println("Pls add a customer detail");
          System.out.println("---------------------------------");
          System.out.println("Pls enter your first name");
          String FName = sc.nextLine();
          System.out.println("---------------------------------");
          System.out.println("Pls add your middle name, if not just type space");
          String MName = sc.nextLine();
          System.out.println("---------------------------------");
          System.out.println("Pls add your last name");
          String LName = sc.nextLine();
          System.out.println(" wellcome to bank26 \n" +FName + " " + MName + " " + LName);
          Bank26.AddCus(FName, MName, LName);
          System.out.println(Bank26.getnumofcustomer());
        
        break;
        case 2: 
        // number customer is not 0
        if (Bank26.getnumofcustomer() !=0){
          System.out.println("list of customer");
          System.out.println("---------------------------------");
          for (int i = 0; i < Bank26.getnumofcustomer(); i++){
            System.out.print((i+1) + ". ");
            System.out.println(Bank26.getCustomer(i));
          }
        }
        else{
          System.out.println("No customer have been added"+ "\n --------------------------------- \n");
        }
        System.out.println();
        break;
        case 3:
        // make sure there's a customer
        if(Bank26.getnumofcustomer() !=0 ){
          System.out.println("Input how many customer");
          int num =sc.nextInt();
          customer AccountcCustomer = Bank26.getCustomer(num-1);
          System.out.println("What to do in " + AccountcCustomer + " Bank26.");
          System.out.println("1. Withdraw");
          System.out.println("2. Deposit"+ "\n --------------------------------- \n");
          int choice2 = sc.nextInt();
          
          switch(choice2){
            case 1 -> {
              System.out.println("Enter the value for withdraw");
              double amountwindraw = sc.nextDouble();
              boolean check = AccountcCustomer.getAccount().withdraw(amountwindraw);
              // Make sure that the balance are not negative
              if (check){
                System.out.println("New Balance: "+ AccountcCustomer.getAccount().getbalance());
              }
              else{
                System.out.println("Balance cant be negative");
              } 
            }
            case 2 ->{
              System.out.print("Enter the value to deposit: ");
              double amountdeposit = sc.nextDouble();
              boolean check =  AccountcCustomer.getAccount().deposit(amountdeposit);
              if(check){
                System.out.println("New Balance: "+ AccountcCustomer.getAccount().getbalance());
              }
              else{
                System.out.println("Input value can't be less than 0");
              }
            }
            default -> System.out.println("Invalid input.");
          }
        }
        else {
          System.out.println("no customer are added yet");
        }
        break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Wrong input");
      }
    }
  }
  public static void menu() {
    // the menu choice 
    System.out.println("=======================");
    System.out.println("1. Add customer");
    System.out.println("2. Get customer list");
    System.out.println("3. Customer deposit/withdraw");
    System.out.println("4. Exit");
    System.out.print("Your choice: ");
  }
}
