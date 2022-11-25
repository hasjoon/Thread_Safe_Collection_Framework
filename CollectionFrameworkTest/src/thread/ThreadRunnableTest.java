package thread;

public class ThreadRunnableTest implements Runnable {


    @Override
    public void run() {
        String treadName = Thread.currentThread().getName();

        System.out.println("This is thread name <<" + treadName + ">> of runnable");
    }
    
}
