package thread;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

//list1 add remove 락
// 반대겨우 synchonize block(this) , 함수정의시에 동기화 가능
// 블럭을 써야 하는 경우는 어떤경우? - 동기화가 필요한 부분도 있고 그렇지 않은 부분도 있음
// 블럭을 사용하는 다른 케이스가 뭔가요?


//list 1,2 size 를 add remove 시 마다 호출
public class AA{
    
    public synchronized void ping(){
        System.out.println("ping");
    }

    public synchronized void pong(){
        System.out.println("pong");
    }

}
