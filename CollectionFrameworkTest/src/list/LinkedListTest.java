package list;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");

        System.out.println("ll: " + ll);

        ll.removeFirst();

        System.out.println("ll: " + ll);

        ll.removeLast();
        
        System.out.println("ll: " + ll);


         //create
        ll.add("f");
        ll.add(0, "aa?");
        ll.offer(null);
        ll.offerFirst(null);
        ll.offerLast(null);
        ll.push(null);

        System.out.println("ll: " + ll);
        //read
        ll.get(0);
        ll.getFirst();
        ll.getLast();
        ll.indexOf(ll);
        ll.contains(ll);
        ll.containsAll(ll);
        ll.peek();
        ll.peekLast();
        ll.peekFirst();
        ll.isEmpty();
        ll.equals("c");

        //update
        ll.set(0, null);
        
        //delete
        ll.remove();
        ll.clear();
        ll.removeFirst();
        ll.removeIf(null);
        ll.removeAll(ll);
        ll.removeLast();
        ll.poll();
        ll.pollFirst();
        ll.pollLast();
        ll.pop();
        
    }
    
}
