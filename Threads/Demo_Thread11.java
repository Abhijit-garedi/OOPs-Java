class FirstThread extends Thread {
   public void run() {
      for (int i = 1; i <= 5; i++) {
         System.out.println("Message from First Thread: " + i);
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            System.out.println("First Thread interrupted when it is sleeping: " + e);
         }
      }
   }
}

class SecondThread extends Thread {
   public void run() {
      for (int i = 1; i <= 5; i++) {
         System.out.println("Message from Second Thread: " + i);
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            System.out.println("Second Thread interrupted when it is sleeping: " + e);
         }
      }
   }
}

public class Demo_Thread11 {
   public static void main(String args[]) {
      FirstThread firstThread = new FirstThread();
      SecondThread secondThread = new SecondThread();
      firstThread.start(); // Start FirstThread
      secondThread.start(); // Start SecondThread
   }
}
