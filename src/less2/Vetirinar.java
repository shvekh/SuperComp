package less2;

public class Vetirinar{
  public static void main(String[] mss) {
    Vetirinar doc = new Vetirinar();
    Animal[] animals = new Animal[3];
    animals[0] = new Dog("Мухтар" , "Нем.овчарка","Мясо" , "Большая клетка");
    animals[1] = new Cat("Барсик", "Мейнкун", "Сухой корм", "Маленькая клетка");
    animals[2] = new Horse("Горбунок", "Мустанг", "Сено", "Конюшня");

    for (Animal a : animals) {
      doc.treatAnimal(a);
    }
  }
  public void treatAnimal(Animal animal){
    System.out.print("Еда:" + animal.food);
    System.out.println(", Локация животного:" + animal.location);


  }
}
