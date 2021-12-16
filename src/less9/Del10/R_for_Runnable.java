package less9.Del10;

public class R_for_Runnable implements Runnable {
  int thread;

  R_for_Runnable(int thread){
    this.thread = thread;
  }
  public void run() {
    for (int i = 0; i <= 100; i++) {
      if (i % 10 == 0) {
        System.out.println(Thread.currentThread().getName() + " Поток:\t" + i + " % 10 = 0");
        try {
          Thread.sleep(300*thread);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
    System.out.println("Поток " + this.thread + " завершился.");
  }
}
