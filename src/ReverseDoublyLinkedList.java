/**
 * Created by wyh669 on 3/28/16.
 */
public class ReverseDoublyLinkedList {

    public static void main(String[] args){


    }

    public void reverseDLL(DoublyLinkedList head,DoublyLinkedList tail ) {
        DoublyLinkedList temp=head; //swap head and tail
        head=tail; // head now points to tail
        tail=temp; //tail points to head
        //traverse the list swapping prev and next fields of each node
        DoublyLinkedList p=head; //create a node and point to head

        while(p!=null) //while p does not equal null
        { //swap prev and next of current node
            temp=p.next; // p.next does that not equal null? confusing.
            p.next=p.prev; //this line makes sense since you have to reverse the link
            p.prev=temp; //having trouble visualizing this.
            p=p.next;//advance current node which makes sense
        }
    }
}


        // null<-1 <->2<->3->null
        // head = 1, tail = 3
        // temp =2, 1.next = null ; 1.prev = 2; p=3         2<-1->null
