package list;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import javax.xml.transform.stream.StreamSource;

public class VectorTest {

    public static void main(String[] args) {
        Vector<String> ve = new Vector<String>();
        

        // create
        ve.add("a");
        ve.add("b");
        ve.add("c");

        Stream<String> stream = ve.stream();
        long count = stream.count();
        System.out.println("how many? " + count);

        Object[] veToArray = ve.toArray();
        System.out.println("veTo: " + veToArray);

        Iterator<String> iterator = ve.iterator();

        while(iterator.hasNext()){
            System.out.println("itt: " + iterator.next());
        }

        

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


        // update
        ve.setElementAt("3", 0);
        ve.set(0, null);
        System.out.println(ve);

        // delete
        ve.remove("a");
    }
}
