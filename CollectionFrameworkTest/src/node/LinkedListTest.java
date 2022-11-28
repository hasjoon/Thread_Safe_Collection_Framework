package node;

import java.util.List;

public class LinkedListTest {
    public ListNode head;

    public LinkedListTest(){
        head = null;
    }

    public void insertNode(ListNode preNode, String data){
        ListNode newNode = new ListNode(data);
        newNode.link = preNode.link;
        preNode.link = newNode.link;
    }

    public void insertNode(String data){
        ListNode newNode = new ListNode(data);

        if(head == null){
            this.head = newNode;
        }else{
            ListNode tempNode = head;
            while(tempNode.link != null){
                tempNode = tempNode.link;
            }

            tempNode.link = newNode;
        }
    }
}
