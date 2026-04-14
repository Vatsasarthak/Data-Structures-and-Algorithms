class Solution {
    Node divide(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node even = null, evenTail = null;
        Node odd = null, oddTail = null;

        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {  // EVEN
                if (even == null) {
                    even = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {  // ODD
                if (odd == null) {
                    odd = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
            temp = temp.next;
        }

        // connect even → odd
        if (even == null) return odd;

        evenTail.next = odd;
        if (oddTail != null) oddTail.next = null;

        return even;
    }
}