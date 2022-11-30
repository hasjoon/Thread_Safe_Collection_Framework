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

            public void method2(){
                int a = 10;
                System.out.println(a);
            }
        }
    }

}