package less3.Car;

public class SportCar extends Car {
  int MaxSpeed;
  public SportCar(int MaxSpeed, int weight, String brand, String classAuto , Engine engine){
    super(weight, brand, classAuto, engine);
    this.MaxSpeed = MaxSpeed;

  }

  public void start(){
    System.out.println("SportCar поехал");

  }
  public void stop(){
    System.out.println("SportCar остановился");

  }
  public void printINFO(){
    System.out.println("Марка спорткара: " + brand
        + "\nКласс автомобиля: " + classAuto
        + "\nВес: " + weight
        + "\nМощность двигателя" + engine.power
        + "\nПроизводитель двигателя" + engine.manufacturer
        + "\nМаксимальная скорость: " + MaxSpeed);

  }

}
