/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/
class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: find length and tail
        Node tail = head;
        int cnt = 1;

        while (tail.next != null) {
            tail = tail.next;
            cnt++;
        }

        // Step 2: make circular
        tail.next = head;

        // Step 3: reduce k
        k = k % cnt;

        // If no rotation needed
        if (k == 0) {
            tail.next = null;
            return head;
        }

        // Step 4: move to new tail (k steps)
        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        // Step 5: set new head and break
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}