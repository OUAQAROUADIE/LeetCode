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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode out = new ListNode(0);
        ListNode tail= out;
        int reste=0;
        while(l1!=null || l2!=null || reste!=0){

            int node1=(l1!=null)?l1.val:0;
            int node2=(l2!=null)?l2.val:0;

            int sum = node1 + node2 + reste;
            int node = sum%10;
            reste=sum/10;

            ListNode newnode = new ListNode(node);
            tail.next = newnode;
            tail=tail.next;


            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        ListNode result = out.next;
        out.next = null;
        return result;
        
    }
}