package thread;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

import thread.thread2.ThreadTest2;

//list1 add remove 락
// 반대겨우 synchonize block(this) , 함수정의시에 동기화 가능
// 블럭을 써야 하는 경우는 어떤경우? - 동기화가 필요한 부분도 있고 그렇지 않은 부분도 있음
// 블럭을 사용하는 다른 케이스가 뭔가요?
//list 1,2 size 를 add remove 시 마다 호출

public class AA {

    public void ping() throws InterruptedException {
        synchronized (this) {
            // for (int i = 0; i < 5; i++) {
            System.out.println("ping");
            wait();
            notifyAll();
            // }
        }
        // for(int i=0; i<3; i++)
        // System.out.println("ping 동기화 블럭 적용 안된곳");
    }

    public void pong() throws InterruptedException {
        synchronized (this) {
            // for (int i = 0; i < 5; i++) {
                System.out.println("pong");
                notifyAll();
                wait();
            // }
        }

        // for(int i=0; i<3; i++)
        // System.out.println("pong 동기화 블럭 적용 안된곳");
    }
}
