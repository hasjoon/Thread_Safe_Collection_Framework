package list;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class VectorTest {

    public static void main(String[] args) {
        Vector<String> ve = new Vector<String>();
        CopyOnWriteArrayList<String> cow = new CopyOnWriteArrayList<>();
        

        // create
        ve.add("a");
        ve.add("b");
        ve.add("c");

        cow.add("a");
        cow.add("b");
        cow.add("c");

        // read
        // Iterator<String> iterator = ve.iterator();
        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        // Iterator<String> iterator2 = cow.iterator();
        // while(iterator2.hasNext()){
        //     System.out.println(iterator2.next());
        // }

        ve.get(0); //synchronized 있음
        cow.get(0);


        // update
        ve.setElementAt("3", 0);
        ve.set(0, null);
        System.out.println(ve);
        cow.set(0, null);
        System.out.println(cow);
        // delete
        ve.remove("a");
        cow.remove("a");
    }
}
