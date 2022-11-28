package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.xml.transform.Source;

public class ArrayListTest {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("b");


        ArrayList<String> arr4 = new ArrayList<>();
        arr4.add("b");
        arr4.add("c");
        
        //Creat
        // arr.add(null);
        // arr.addAll(arr4); //collection 전체다 가능
        // arr.clone(); 
        

        ArrayList<String> arr5 = (ArrayList<String>) arr.clone();
        //shallow copy (얖은 복사)를 한다
        //얕은 복사 = 같은 인스턴스를 참조함 = 참조 인스턴스르 바꾸면 (arr을 바꾸면) arr5의 값도 바뀜
        //깊은 복사 = 다른 인스턴스르 생성함
        System.out.println("arr5: " + arr5);

        arr.add("d"); //추가된 객체는 위의 두개의 객체주소와 다르기에 결과값은 다름
        System.out.println("arr: " + arr); //[a,b,c,d]
        System.out.println("arr5 changed: " + arr5); //[a,b,c]

        //그러나
        arr.set(0,"aaaa");
        System.out.println("arr: " + arr);
        System.out.println("arr5 changed: " + arr5);
        
        
        

    
        //Read
        // arr.get(0);
        // arr.contains(arr4);
        // arr.containsAll(arr4);


        //Update
        // arr.set(0, null);
        // arr.replaceAll();


        arr.retainAll(arr4);

        //Delete
        arr.remove(0);
        // arr.remove("c");
        // arr.removeAll(arr4);
        // arr.removeIf(n -> (n == "c"));
        // arr.clear();

        //Search
        System.out.println(arr.indexOf("aaaa"));
        System.out.println(arr.lastIndexOf("b"));
        boolean empty = arr.isEmpty();
        System.out.println("eee: " + empty);

        //변환
        // String[] array = arr.toArray(new String[arr.size()]);
        // for(int i = 0; i<array.length ; i++){
        //     System.out.println("toArray: " + array[i]);
        // }

        // ArrayList<String> arr3 = new ArrayList<>(Arrays.asList(array));
        // System.out.println("asList: " + arr3);
        

        // System.out.println("ArrayList: " + arr);

        // ArrayList<Fruit> fruits = new ArrayList<>();
        // fruits.add(new Fruit("orange", 1000));
        // fruits.add(new Fruit("grape", 2000));


        // ArrayList<Fruit> copyFruits = (ArrayList<Fruit>) fruits.clone(); 
        // //고쳐주기 위해서는 clone을 override 해서 return 시에 타입캐스팅을 해주면 된다, 또한 ArrayList에 객체를 넣고 clone시에 객체의 주소값 복사 하기때문에
        // //original fruit객체를 변경하면 
        // Fruit oragne = fruits.get(0);
        // oragne.setPrice(10000);

        // System.out.println("fruit: " + fruits); 
        // System.out.println("C fruit: " + copyFruits);


        // ArrayList<Fruit> copyFruits2 = new ArrayList<>(); //deep copy 
        // for(Fruit f : fruits){
        //     copyFruits2.add(f.clone());
        //     // System.out.println("fruit copy: " + copyFruits2);
        // }
        // oragne.setPrice(20000);
        // System.out.println("original fruit: " + fruits);
        // System.out.println("shallow copy fruit: " + copyFruits);
        // System.out.println("deep copy fruit: " + copyFruits2);

    }
}

