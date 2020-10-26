final class ThreadStarter implements Runnable {
 public ThreadStarter() {
   Thread thread = new Thread(this);
   thread.start();
 }
 @Override public void run() {
  // . . .
 }
}
