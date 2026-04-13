class Solution {

    // Reverse Linked List (iterative)
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow.next);

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node temp = secondHalf;

        while (temp != null) {
            if (firstHalf.data != temp.data) {
                reverse(secondHalf); // restore list
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Step 4: Restore original list
        reverse(secondHalf);

        return true;
    }
}