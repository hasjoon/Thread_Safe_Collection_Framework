package classes;

import javax.sound.sampled.SourceDataLine;

public class ClassesMain {
    public static void main(String[] args) {
        AnonymousClassTest act = new AnonymousClassTest();

        AnonymousClassTest.NestedMemberClass nestedMemberClass = act.new NestedMemberClass();

        System.out.println(nestedMemberClass.b);

        
    }
}
