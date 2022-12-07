package thread.thread3;

import thread.AA;

public class Thread0 extends Thread{
    private AA aa;

    public void run(){
        try {
            aa.ping();
        } catch (InterruptedException e) {
            System.out.println("errrrrrr");
            e.printStackTrace();
        }
    }
}
