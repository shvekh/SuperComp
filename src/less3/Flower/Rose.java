package less3.Flower;

import less3.Flower.Flower;

public class Rose extends Flower {
  int price_flower = 400;
  public Rose(int margin){
    super(margin);

  }
  public int Cost(){
    return margin + price_flower;
  }

}
