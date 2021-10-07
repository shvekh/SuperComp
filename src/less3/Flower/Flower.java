package less3.Flower;

public class Flower {
  int margin;
  public static void main(String[] mss){
    int margin = 200;
    Flower Roses = new Rose(margin);
    Flower Peonies = new Peonies(margin);
    Flower Tulips = new Tulips(margin);
    Flower Carnations = new Carnation(margin);
    Flower bqtOne[] = {Roses,Roses,Peonies,Peonies,Tulips,Tulips};
    Flower bqtTwo[] = {Carnations,Tulips,Peonies,Roses};
    Flower bqtThree[] = {Tulips,Tulips,Tulips};
    System.out.print("Всего продали цветов: ");
    System.out.print(bqtOne.length + bqtTwo.length + bqtThree.length);

  }
  public Flower(int margin){
    this.margin = margin;
  }
  public int Cost(){
    return margin;
  }

}
