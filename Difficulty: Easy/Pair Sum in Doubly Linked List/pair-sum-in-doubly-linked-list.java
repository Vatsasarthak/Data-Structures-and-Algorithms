/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (head == null) return result;

        // Step 1: Get the last node
        Node left = head;
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        // Step 2: Two pointer approach
        while (left != null && right != null && left != right && left.prev != right) {
            int sum = left.data + right.data;

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                result.add(pair);

                left = left.next;
                right = right.prev;
            } 
            else if (sum < target) {
                left = left.next;
            } 
            else {
                right = right.prev;
            }
        }

        return result;
    }
}
