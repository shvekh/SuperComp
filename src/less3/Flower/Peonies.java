package less3.Flower;

import less3.Flower.Flower;

public class Peonies extends Flower {
  int price_flower = 350;
  public Peonies(int margin){
    super(margin);

  }
  public int Cost(){
    return margin + price_flower;
  }

}
