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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count =0;
        ListNode prev=null;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if (n == count) {
            return head.next;
        }
    int remove = count - n;
    temp = head;
    int cnt=0;
    while(temp != null){
        if(cnt == remove){
            cnt++;
            prev.next = temp.next;
            break;
        }
        prev =temp;
        temp =temp.next;
        cnt++;
    } 
    return head;  
    }
}