package classes;

import javax.sound.sampled.SourceDataLine;

public class AnonymousClassTest{

    class NestedMemberClass{
        int b = 200;

        public void method3(){
            int b = 20;
            System.out.println(b);
        }
    }

    public void method1(){

        class NestedLocalClass{
            int a = 100;

            public void method2(){ //비동기 처리를 위해서 스레드 객체를 만들때 사용한다

                // static aaa = 100; 로컬클래스에는 스태틱 사용 불가 = 어차피 메소드 내에서만 살아있는 클래스라 접근을 제한할 필요가 없음
                
                int a = 10;
                System.out.println(a);
            }
        }
    }

}