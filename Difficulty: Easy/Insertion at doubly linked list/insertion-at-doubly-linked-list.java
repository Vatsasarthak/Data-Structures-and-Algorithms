/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node temp = head;
        int count =0;
        while(count < p){
            temp = temp.next;
            count++;
        }
        Node after =temp.next;
        Node newNode = new Node(x);
        newNode.prev = temp;
        newNode.next =after;
        temp.next = newNode;
        if(after != null){
            after.prev =newNode;
        }
        return head;
    }
}