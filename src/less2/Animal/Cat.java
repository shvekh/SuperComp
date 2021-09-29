package less2.Animal;

import less2.Animal.Animal;

public class Cat extends Animal {
  String name;
  String breed;
  public Cat(String name, String breed, String food, String location){
    this.food = food;
    this.location = location;
    this.name = name;
    this.breed = breed;

  }

  public void makeNoise(){
    System.out.println("Meow");
  }
  public void eat(){
    System.out.println("Meat and Fish");
  }

}
