/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        if(head == null || head.next == null){
            return -1;
        }
        Node meet=detectLoop(head);
        if(meet == null){
            return -1;
        }
            else{
                Node slow = head;
                Node fast =meet;
                while(fast != slow){
                    slow= slow.next;
                    fast = fast.next;
                }
                return slow.data;
            }
        }
    Node detectLoop(Node head){
        Node slow=head;
        Node fast=head;
          while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
    }
