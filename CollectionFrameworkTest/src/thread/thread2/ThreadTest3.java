package thread.thread2;

import thread.AA;

public class ThreadTest3 implements Runnable{

    @Override
    public void run() {
        AA aa = new AA();

        String threadName = Thread.currentThread().getName();
        // switch(threadName){
        //     case "Thread-0" : try {
        //             aa.ping();
        //         } catch (InterruptedException e1) {
        //             // TODO Auto-generated catch block
        //             e1.printStackTrace();
        //         }
        //     case "Thread-1" : try {
        //             aa.pong();
        //         } catch (InterruptedException e1) {
        //             // TODO Auto-generated catch block
        //             e1.printStackTrace();
        //         }
        //         case "Thread-2" : try {
        //             aa.ping();
        //             System.out.println("thread 2");
        //         } catch (InterruptedException e1) {
        //             // TODO Auto-generated catch block
        //             e1.printStackTrace();
        //         }
        // }

        Integer substring = Integer.parseInt(threadName.substring(7));
        if(substring == 0 || substring%2==0){
            try {
                System.out.println("evenNumber: " + threadName);
                aa.ping();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            try {
                System.out.println("oddNumber: " + threadName);
                aa.pong();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        // try {
        //     aa.ping();
        //     aa.pong();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        
    }
    
}
