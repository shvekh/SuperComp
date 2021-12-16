package less9.Del10;

public class M_for_Main {
  public static void main(String[] mss) {
    for (int i = 1; i <= 3; i++) {
      new Thread(new R_for_Runnable(i), String.valueOf(i)).start();
    }
  }
}
