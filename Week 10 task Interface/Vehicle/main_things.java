import java.util.ArrayList;

public class main_things {
  public static void main(String[] args) {
    ArrayList<PoliceCar> myArray = new ArrayList<PoliceCar>();
    PoliceCar myPoliceCar = new PoliceCar();
    myArray.add(myPoliceCar);
    System.out.println(myArray.get(0).soundSiren());
  }
}
