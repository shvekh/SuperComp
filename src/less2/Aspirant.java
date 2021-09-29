package less2;

public class Aspirant extends Student {
  String NR;

  public Aspirant(String firstName, String lastName, String group, double averageMark, String NR) {
    super(firstName,lastName,group,averageMark);
    this.NR = NR;
  }
  int getScholarship(){
    if (averageMark == 5)
      return 200;
    else
      return 180;
  }







}
