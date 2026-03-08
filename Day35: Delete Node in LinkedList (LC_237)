/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;          
        node.next=node.next.next;
        
    }
}

// example : List=[1,2,6,4] and node=6;           
//           node.val=node.next.val          here node val is 6 but after updating that node value to node.next.val new value is 4 & new list=[1,2,4,4]
//           node.next=node.next.next        now the current node which is 4 link that node to the next.next noe value which is null here 
// therefore list is [1,2,4]   
