// File Name: RunnableExample.java

class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class RunnableExample  {
    public static void main(String[] args) {
        MyThread runnableObject = new MyThread();
        Thread thread = new Thread(runnableObject);  // Passing Runnable to Thread
        thread.start();  // Start the thread

        System.out.println("Main thread finished!");
    }
}
