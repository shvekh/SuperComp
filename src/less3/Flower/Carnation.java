package less3.Flower;

public class Carnation extends Flower {
  int price_flower = 300;
  public Carnation(int margin){
    super(margin);

  }
  public int Cost(){
    return margin + price_flower;
  }

}
