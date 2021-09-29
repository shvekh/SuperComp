package less2;


public class Horse extends Animal {
  String name;
  String breed;
  public Horse(String name, String breed, String food, String location){
    this.food = food;
    this.location = location;
    this.name = name;
    this.breed = breed;
  }

  public void makeNoise(){

    System.out.println("Neigh");
  }
  public void eat(){
    System.out.println("Hay");
  }

}
