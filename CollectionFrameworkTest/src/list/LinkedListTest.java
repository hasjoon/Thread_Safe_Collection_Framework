package list;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.function.UnaryOperator;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");

         //create
        ll.add("f");
        ll.add(2, "aa?");
     
        //node = 
        //index의 값 (size 오른쪽 비트연산한 값이 index보다 크면 (index<size true))
        //index뒤의 값을 줌(만약 size를 오른쪽으로 1비트 비트연산 한 값보다 index가 크다면 (index<size false))
    
        // ll.addFirst(null); //첫번째 노드 first를 e의 뒤의 값으로 보내는 것
        // ll.addLast(null);
        // ll.offer(null); //add와 같음
        // ll.offerFirst(null);
        // ll.offerLast(null); //add와 같음
        // ll.push(null); //addFirst와 같음

        ArrayList<String> lll = new ArrayList<>();
        lll.add("aa");
        lll.add("bb");
        lll.add("cc");

        ll.addAll(lll);
        ll.addAll(0, lll);

        

        System.out.println("ll: " + ll);
        System.out.println("ll index?: " + ll.get(2));
        // //read
        
        ll.get(0);
        ll.getFirst();
        ll.getLast();
        int indexOf = ll.indexOf("cc"); //파라미터 값(object)이 몇번째 있는지 순차탐색
        boolean contains = ll.contains("bb");
        System.out.println("contains: " + contains);
        boolean containsAll = ll.containsAll(ll);
        System.out.println("containsAll: " + containsAll);
        String peek = ll.peek();
        System.out.println("peek: " + peek);
        String peekLast = ll.peekLast();
        System.out.println("peeklast: " + peekLast);
        ll.peekFirst();
        ll.isEmpty();
        ll.equals("c");

        String element = ll.element();
        System.out.println("element: " + element);

        // //update
        // ll.set(0, null);       
        ll.replaceAll(s -> s+s);
        System.out.println("replaceall: " + ll);      
        // ll.retainAll(lll);
        
        // //delete
        System.out.println("ll all: " + ll);
        ll.remove(); //첫번째값 삭제

        ll.add(null);
        System.out.println("ll remove: " + ll);
        ll.remove(null); //해당 값 삭제
        System.out.println("ll remove object: " + ll);

        ll.remove(2); //인덱스 삭제
    
        ll.clear();

        LinkedList<String> llll = new LinkedList<>();
        llll.add("aa");
        llll.add("bb");
        llll.add("cc");
        llll.removeFirst();
        // ll.removeIf(null);
        ll.removeAll(ll);
        ll.removeLast();
        ll.poll();
        ll.pollFirst();
        ll.pollLast();
        ll.pop();
        
    }
    
}
