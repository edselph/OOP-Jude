public class genus{
  private String GenusName;
  public void Genus(String i){
    setGenusName(i);
  }
  public void setGenusName(String i){
    GenusName = i;
  }
  public String getGenusName(){
    return GenusName;
  }
  public String toString(){
    return "Genus" + getGenusName();
  }

  public int countSpecimens( Specimen[] animals, Species s ){
    int count = 0;
    for(Specimen animal: animals){
      if (animal.getTOA() == s){
        count++;
      }
    }
    return count;
  }
  public LinkedList makeList( Specimen[] animals ){
    LinkedList<Specimen> Thingy = new LinkedList<Specimen>();
    for(Specimen animal: animals){
      Thingy.add(animal)
    }
    return Thingy;
  }
  public LinkedList makeSpeciesList( LinkedList animals ){
    LinkedList<Species> Thingy = new LinkedList<Species>();
    Iterator<Species> iterator = Thingy.listIterator(0);
    while(iterator.hasNext()){
      Thiny.add(iterator.next().getTOA());
    }
    return Thingy;
    }
  
    public LinkedList makeSpeciesListUnique( LinkedList allSpecies ){
    LinkedList<Species> Thingy = new LinkedList<Species>();
    Iterator<Species> iterator = Thingy.listIterator(0);
    while(iterator.hasNext()){
      if(!Thingy.contains(iterator.next().getTOA())){
        Thingy.add(iterator.next().getTOA());
      }
    }
    return Thingy;
    }
  }

