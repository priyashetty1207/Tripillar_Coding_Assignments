package Module5;

class ThreadLifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadLifeCycle t = new ThreadLifeCycle();

        System.out.println("State: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());
    }
}