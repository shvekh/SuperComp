package less3.Car;

public abstract class Car {
  String brand,classAuto;
  int weight;
  Engine engine;
  public Car(int weight, String brand, String classAuto, Engine engine){
    this.weight=weight;
    this.brand=brand;
    this.classAuto=classAuto;
    this.engine=engine;
  }

  public abstract void start();
  public abstract void stop();
  public void turnLeft(){
    System.out.println("Поворот налево");

  }
  public void turnRight(){
    System.out.println("Поворот направо");

  }
  public abstract void printINFO();

}
