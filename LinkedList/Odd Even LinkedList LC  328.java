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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd_list=new ListNode (-1);
        ListNode even_list = new ListNode(-1);
        ListNode odd= odd_list;
        ListNode even= even_list;
        ListNode curr=head;
        int i=1;
        while(curr!=null){
            if(i%2==0){
                even.next=curr;
                even=even.next;
            }
            else{
                odd.next=curr;
                odd=odd.next;
            }
            i++;
            curr=curr.next;
        }
        even.next=null;
        odd.next=even_list.next;
        return odd_list.next;
        
    }
}
