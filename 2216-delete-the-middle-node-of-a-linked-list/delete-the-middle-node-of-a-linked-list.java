/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        ListNode prev =null;
        if(head == null || head.next == null){
            return null;
        }
        int count =0;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int mid = count / 2;
        int cnt=0;
        while(temp != null){
            if(cnt == mid){
                prev.next = temp.next;
                cnt++;
                break;
            }
            prev = temp;
            temp = temp.next;
            cnt++;
        }
        return head;
    }
}