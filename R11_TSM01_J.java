final class ThreadStarter implements Runnable {
 public void startThread() {
 Thread thread = new Thread(this);
 thread.start();
 }
 @Override public void run() {
 // . . .
 }
}
