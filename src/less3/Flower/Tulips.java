package less3.Flower;

import less3.Flower.Flower;

public class Tulips extends Flower {
  int price_flower = 250;
  public Tulips(int margin){
    super(margin);

  }
  public int Cost(){
    return margin + price_flower;
  }

}
