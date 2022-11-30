package thread.thread2;

import thread.AA;

public class ThreadTest2 {

    public static void main(String[] args) throws InterruptedException {
        // System.out.println("main함수 시작");

        // 멀티스레딩에서는 생각했던대로 동작하지 않을 수 있다.
        // 1121 이 나왓던 상황에서는 락을 2개 쓰지 않고 다르게 쓴다
        // reanterance lock
        // 읽기와 쓰기를 별도로 락을 걸 수 잇따.cxd

        AA aa = new AA();

        Thread thread1 = new Thread(() -> {
            // forLoop(null);
            try{
                // for(int i=0; i<5; i++)
                aa.ping();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            // forLoop("a");
            try {
                // for(int i=0; i<5; i++)
                aa.pong();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        // thread1.join();
        thread2.start();
        // thread2.join();
        // System.out.println("main함수 종료");
    }

    // static void forLoop(String target) {
    //     AA aa = new AA();
    //     try {
    //         for(int i=0; i<5; i++){
    //             if(target != null){
    //                 aa.ping();
    //             }
    //             else{
    //                 aa.pong();
    //             }
    //         }
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    // }
}

/*
 * Synchronized Method
 * 인스턴스 단위(synchronized가 적용된 곳은 전부 락 공유)의 락
 * 하나의 객체로 2개의 스레드가 경합함
 * 만약 각각의 객체로 만든다면 lock을 공유하지 않기 때문에 동기화 발생하지 않음
 * 인스턴스의 접근 자체에 락이 걸리는것이 아니라 메소드에 synchronized 키워드가
 * 있을때 락이 걸림
 * 
 * 임계영역을 진입할때 한 스레드만 진입가능하도록 함 = synchronized
 * 
 * a.print활성화
 * 락이 걸린 중간에 프린트 출력됨
 * 그러나 프린트에도 synchronized키워드 넣어주면 락이 끝나고 나서 호출됨
 * = synchronized가 적용된 모든 object에 대해서 락을 공유함
 */
// A a = new A();
// Thread thread1 = new Thread(() -> {
// a.run("Thead1");
// });
// Thread thread2 = new Thread(() -> {
// a.run("Thead2");
// // a.print("Thread2");
// });
// thread1.start();

// // Thread.sleep(5000);
// thread2.start();
/*
 * Static Synchronized Method
 * 클래스 단위로 락을 건다 (인스턴스 x)
 * 객체가 여려개여도 락이 제대로 작동함
 * 
 * a2.print활성화
 * 스태틱단위와 인스턴스단위는 락을 공유하지 않음
 */

// A a1 = new A();
// A a2 = new A();

// Thread thread1 = new Thread(() -> {
// a1.run("Thread1");
// });
// Thread thread2 = new Thread(() -> {
// a2.run("Tread2");
// // a2.print("Thread2");
// });
// thread1.start();
// thread2.start();

/*
 * Synchronized Block
 * 인스턴스 단위의 락 (블럭 내부에서 동기화 발생)
 * 락 객체를 지정해줘야 한다.
 * 메소드 단위로 락이 발생함
 */
// A a = new A();

// Thread thread1 = new Thread(() -> {
// a.run("Thread1");
// });
// Thread thread2 = new Thread(() -> {
// a.run("Tread2");
// });
// thread1.start();
// thread2.start();

/*
 * Static Synchronized Block
 * 클래스단위 락
 */
// A a1 = new A();
// A a2 = new A();

// Thread thread1 = new Thread(() -> {
// a1.run("Thread1");
// });
// Thread thread2 = new Thread(() -> {
// a2.run("Tread2");
// // a2.print("Thread2");
// });
// thread1.start();
// thread2.start();