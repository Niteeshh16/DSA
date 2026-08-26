package linkedlist;

public class InsertAtHead {

    Node head;

    void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display(){

        Node temp  = head;
        while (temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
    }

    int findLength(){
        int count = 0;
        Node temp = head;

        while (temp != null){
            count++;
            temp = temp.next;

        }
        return count;
    }

    static void main() {
        InsertAtHead i = new InsertAtHead();
        i.insert(23);
        i.insert(234);
        i.insert(12);
        i.insert(124);
        System.out.println(i.findLength());
        i.display();
    }
}
