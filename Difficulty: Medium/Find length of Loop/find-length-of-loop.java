class Solution {
    public int lengthOfLoop(Node head) {
        if (head == null || head.next == null) {
            return 0;
        }

        Node meet = detectloop(head);

        if (meet == null) {
            return 0;
        } else {
            int count = 1;
            Node temp = meet.next;

            while (temp != meet) {
                temp = temp.next;
                count++;
            }

            return count;
        }
    }

    Node detectloop(Node head) {
        Node slow = head;
        Node fast = head;

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