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

// Example 1:Input: head = [1,2,6,3,4,5,6], val = 6    Output: [1,2,3,4,5]
// Example 2:Input: head = [], val = 1                 Output: []
// Example 3:Input: head = [7,7,7,7], val = 7          Output: []


class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode list = new ListNode(0);
       list.next=head;                         // dummy node ko head se connect krne k lie 
       ListNode curr= list;                   // traversal of list starts from dummy node;
       while(curr.next!=null){
        if(curr.next.val==val){              // if the node val is same as the target value
            curr.next=curr.next.next;        // update the value 
        }
        else{
            curr=curr.next;
        }
       }
       return list.next;
    }
}


