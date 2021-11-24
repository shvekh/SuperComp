package less6.Zd2;

public class check {
  public static void main(String[] args) {

    Arr<String> list = new Arr<>();
    list.add("a","1","b","2","c","3","d","4","e");
    list.print();
    list.remove(1);
    list.print();
    list.remove("1");
    list.remove("2");
    list.remove("3");
    list.remove("4");
    list.print();
    System.out.println(list.get(1));
    list.clear();
    list.add("M", "i","k","h","a","i","l");
    list.print();
  }

}
