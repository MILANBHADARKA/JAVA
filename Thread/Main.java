class Isalivejoin extends Thread {
    public void run() {
        System.out.println("Child thread started");
        try {
            Thread.sleep(5000); // Simulate some work for 5 seconds
        } catch (InterruptedException e) {      }
        System.out.println("Child thread finished");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a child thread
        Isalivejoin childThread = new Isalivejoin();

        // Start the child thread
        childThread.start();

        // Check if the child thread is alive
        while (childThread.isAlive()) {
            System.out.println("Main thread: Child thread is still alive.");
            try {
              Thread.sleep(1000);
            } catch (Exception e) {   }
        }

        // Wait for the child thread to finish
        try {
            childThread.join();
			System.out.println("Child thread join");
        } catch (InterruptedException e) {    }

        System.out.println("Main thread: Child thread has finished.");
    }
}