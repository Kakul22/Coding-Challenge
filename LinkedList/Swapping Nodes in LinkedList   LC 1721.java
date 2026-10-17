
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode second=head;
        ListNode temp=first;
        while(temp.next!=null){
            temp=temp.next;
            second=second.next;
        }
        int val=first.val;
        first.val=second.val;
        second.val=val;
        return head;
    }
}

Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]


Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
