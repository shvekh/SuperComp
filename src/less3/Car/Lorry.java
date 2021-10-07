package less3.Car;

public class Lorry extends Car {
  int lifting_capacity;
  public Lorry(int lifting_capacity, int weight, String brand, String classAuto , Engine engine){
    super(weight, brand, classAuto, engine);
    this.lifting_capacity=lifting_capacity;

  }

  public void start(){
    System.out.println("Грузовик поехал");

  }
  public void stop(){
    System.out.println("Грузовик остановился");

  }
  public void printINFO(){
    System.out.println("Марка грузовика: " + brand
        + "\nКласс автомобиля: " + classAuto
        + "\nВес: " + weight
        + "\nМощность двигателя" + engine.power
        + "\nПроизводитель двигателя" + engine.manufacturer
        + "\nГрузоподъемность: " + lifting_capacity);

  }

}
