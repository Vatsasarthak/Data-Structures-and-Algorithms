
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashMap;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        HashMap<ListNode, Integer> check = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            if (check.containsKey(temp)) {
                return temp;
            }
            check.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }
}