/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == x) {

                Node next = temp.next;
                Node prev = temp.prev;

                
                if (temp == head) {
                    head = next;
                }

                if (prev != null) {
                    prev.next = next;
                }

                if (next != null) {
                    next.prev = prev;
                }

                temp = next; 
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}