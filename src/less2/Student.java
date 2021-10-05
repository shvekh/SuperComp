package less2;

public class Student {
  String firstName, lastName, group;
  double averageMark;

  public static void main(String[] mss){
    Student stud = new Student("Mikhail", "Shvekhgeymer", "BAP1801", 4.8);
    Student SA = new Aspirant("Mansur","Shaidullin","BAP1801", 4.9, "Q_kopter");
    Aspirant asp = new Aspirant("Nikita","Belov","caf_Isua",5,"Q_kopter");
    Student[] all = {stud,SA,asp};

    for (Student i : all)
      System.out.println(i.getScholarship());


  }

  public Student(String firstName, String lastName, String group, double averageMark) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
    this.averageMark = averageMark;
  }

  int getScholarship(){
    if (averageMark == 5)
      return 100;
    else
      return 80;
  }



}
