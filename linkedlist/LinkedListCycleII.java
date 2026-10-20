package linkedlist;

public class LinkedListCycleII {

    static Node find(Node head) {

        Node slow = head;
        Node fast = head;

        // Phase 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // set the slow as teh head

                //Because of the mathematical property of Floyd's algorithm:
                //The distance from head to the cycle start is equal to the distance from the first meeting point to the cycle start, when moving around the cycle.
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Create cycle: 5 → 3
        node5.next = node3;

        Node result = find(node1);

        if (result != null) {
            System.out.println("Cycle starts at: " + result.data);
        } else {
            System.out.println("No cycle");
        }
    }
}