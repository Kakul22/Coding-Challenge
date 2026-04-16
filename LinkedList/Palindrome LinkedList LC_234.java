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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al= new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        int left=0;
        int right=al.size()-1;
        while(left<right){
            if(!al.get(left).equals(al.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
