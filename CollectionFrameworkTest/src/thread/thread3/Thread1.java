package thread.thread3;

import thread.AA;

public class Thread1 extends Thread{
    private AA aa;

    public void run(){
        try {
            aa.pong();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}