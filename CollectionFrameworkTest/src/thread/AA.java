package thread;

public class AA {

    static int threadCount = 0;
    // static int mod = threadCount % 2;
    //핑이 먼저 실행되도록, 그리고 퐁이 실행되도록 도와주는 변수들
    //나머지를 활용해서 ping일 시에는 threadCount가 0 또는 짝수
    //pong일때는 threadCount가 홀수 임

    public void ping() throws InterruptedException {
        synchronized (this) {
            if ((threadCount == 0 ||threadCount%2 == 0) && threadCount<20 ) {
                System.out.println("<<ping>>");
                threadCount++;
                notifyAll();
                wait();
            } 
        }
    }


    public void pong() throws InterruptedException {
        synchronized (this) {
            System.out.println("threadCount: " + threadCount);
            if ((threadCount%2 == 1 || threadCount == 1)&&threadCount<19){
                System.out.println("<<pong>>");
                threadCount++;
                notifyAll();
                wait();
            }else if(threadCount >= 19){
                System.out.println("<<pong>>");
                notifyAll();
            }
            else{
                waitPong();
            }
            
        }
    }

    public void waitPong() throws InterruptedException{
        synchronized(this){
            notifyAll();
            wait();
        }
    }

    public void oneMoreNotify(){
        synchronized (this){
            notifyAll();
        }
    }
}
