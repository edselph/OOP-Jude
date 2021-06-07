public class PoliceCar implements isEmergency, LandVehicle {
  public String Id = "Blackmamba";
  public int unitId = 13;
  public  int numWheel= 5;
  public int maxSpeed = 360; /* Km/H */
  public int maxPassengers = 4;


  public String soundSiren(){
    return "WOpwop that sound of the police";
  }

  public String drive(){
    return "BRMMMMMMMMMMM";
  }

  String inPursuit(){
    return "gogogogogo";
  }

  String freePower(){
    return "Cannot be stop by red light";
  }
}
