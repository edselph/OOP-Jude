public class HoverCraft implements LandVehicle, SeaVessel{
  String enterLand(){
    return "walking on lands here";
  }
  String enterSea(){
    return "Swimming time";
  }
  public String drive(){
    return "whooos";
  }

  public int Launch(){
    return 60; /* Km/H */
  }
}