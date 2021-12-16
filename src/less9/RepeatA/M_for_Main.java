package less9.RepeatA;

public class M_for_Main {
  public static void main(String[] mss) {
    StringBuilder A = new StringBuilder();
    A.append('a');
    for (int i = 1; i <= 3; i++) {
      new T_for_Thread(A).start();
    }
  }
}
