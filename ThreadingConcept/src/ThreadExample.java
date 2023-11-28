class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " (Thread) Value " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " (Runnable) Value " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String args[]) {
        // Extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Implementing Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}

