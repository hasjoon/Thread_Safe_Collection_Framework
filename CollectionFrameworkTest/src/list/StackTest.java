package list;

import java.util.Stack;
import java.util.function.UnaryOperator;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();


        //Create
        st.push("a");
        st.push("b");
        st.push("c");
        st.add("d");

        // System.out.println("ddd: " + st);
        // //Read
        // st.get(0);
        // st.peek();
        // st.contains("f");
    
        
        // //Update
        // st.set(2, null);
        // System.out.println(st);
        UnaryOperator<String> uu = n -> n+n;
        st.replaceAll(uu);

        Stack<String> st2 = new Stack<>();
        st2.push("aa");
        st2.push("bb");

        st.retainAll(st2);

        System.out.println(st);

        // //Delete
        // st.pop();
        st.remove(st2);
        
        
    }
}
