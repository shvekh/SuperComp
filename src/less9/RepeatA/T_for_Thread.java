package less9.RepeatA;

public class T_for_Thread extends Thread {
  private StringBuilder A;

  public T_for_Thread(StringBuilder A) {
    this.A = A;
  }
  public void run() {
    synchronized (A) {
      for (int i = 0; i < 100; i++) {
        System.out.print(A);
      }
      System.out.println();
      char ch = A.charAt(0);
      A.setCharAt(0, (char) (A.charAt(0) + 3));
    }
  }
}
