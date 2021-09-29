package less2.Animal;

import less2.Animal.Animal;

public class Dog extends Animal {
  String name;
  String breed;
  public Dog(String name, String breed, String food, String location){
    this.food = food;
    this.location = location;
    this.name = name;
    this.breed = breed;

  }

  public void makeNoise(){
    System.out.println("Gav");
  }
  public void eat(){
    System.out.println("Meat");
  }

}
