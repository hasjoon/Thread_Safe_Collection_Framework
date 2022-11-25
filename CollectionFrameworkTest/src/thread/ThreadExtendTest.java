package thread;


public class ThreadExtendTest extends Thread{
    

    @Override
    public void run(){
        String treadName = Thread.currentThread().getName();
        System.out.println("This is thread name <<" + treadName + ">> of extend thread");
    }
}
