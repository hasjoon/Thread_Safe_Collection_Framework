package thread;

class MyClass{
    int val;	
    public synchronized void sum() { //메서드 동기화
    //어떤 스레드가 sum 메서드에 접근하게 되면 해당스레드는 MyClass객체에 lock flag를
    //갖게되고 다른 스레드는 mc객체에 접근할 수 없음
        System.out.println("더하기 !!");
        val++;
        System.out.println("결과값 :  " + val);
    }
}

class MyThread implements Runnable{
    MyClass mc;
    public MyThread(MyClass mc) {
        this.mc = mc;
    }
    
    @Override
    public void run() {
        mc.sum();
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyClass mc = new MyClass();	

        /*
         * 동시성 이슈 + 해결법
         * 10개의 스레드가 동시에 하나의 메서드에 접근 하지만 메서드 동기화
         * (임계영역의 값이 있는 곳에 synchronized 키워드 붙임)
         */
        for(int i = 0; i < 10; i ++) {
            new Thread(new MyThread(mc)).start();
        }

        /*
         * sleep 후 print
         */
        // ThreadTestBasic testBasic = new ThreadTestBasic();
        // testBasic.run();

        /*
         * 스레드 작성하는 2가지 방법
         * implements runnable vs extend Thread
         */
        // Thread threadExtendTest = new ThreadExtendTest();

        Runnable threadRunnableTest = new ThreadRunnableTest();
        Thread threadRunnableTestThread = new Thread(threadRunnableTest);

        // threadExtendTest.start();
        threadRunnableTestThread.start();
        

    }
}
