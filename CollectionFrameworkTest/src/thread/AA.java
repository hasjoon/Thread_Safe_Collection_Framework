package thread;

//list1 add remove 락
// 반대겨우 synchonize block(this) , 함수정의시에 동기화 가능
// 블럭을 써야 하는 경우는 어떤경우? - 동기화가 필요한 부분도 있고 그렇지 않은 부분도 있음
// 블럭을 사용하는 다른 케이스가 뭔가요?
//list 1,2 size 를 add remove 시 마다 호출

public class AA {
    // 한번도 실행이 안된 상태에서는 가능함
    // 퐁이 호출되어야 실행가능
    // 그전 단계가 핑이라면 퐁이 호출될때까지 기다려야함
    static int threadCount = 0;
    static int mod = threadCount % 2;

    public void ping() throws InterruptedException {
        synchronized (this) {
            // if (threadCount == 0 || mod == 0) {
                // System.out.println(Thread.currentThread().getName() + " ping");
                System.out.println("<<ping>>");
                threadCount++;
                System.out.println("ping count");
                notifyAll();
                System.out.println("ping notiall");
                wait();
                System.out.println("ping wait");
            // }
        }
    }

    // 핑이 호출되고 난 뒤에 가능
    // 그전 단계가 퐁이라면 핑이 호출될때까지 기다려야함
    public void pong() throws InterruptedException {
        synchronized (this) {
            if (threadCount==1 || (mod==1 && threadCount<20)) {
                System.out.println("<<pong>>");
                System.out.println(Thread.currentThread().getName() + " <<pong>>");
                threadCount++;
                System.out.println("tCount of pong: " + threadCount);
                System.out.println("pong count");
                notifyAll();
                System.out.println("pong notiAll");
                wait();
                System.out.println("pong wait");
            }
            
            // else{
            //     notifyAll();// System.out.println(Thread.currentThread().getName()+" pong반복문 못돌음");
            //     wait();
            // }
        }
    }

    public void oneMoreNotify(){
        synchronized (this){
            notifyAll();
        }
    }
}
