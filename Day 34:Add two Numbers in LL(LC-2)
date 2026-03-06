Example 1:           Input: l1 = [2,4,3], l2 = [5,6,4]                 Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:           Input: l1 = [0], l2 = [0]                         Output: [0]
Example 3:           Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]       Output: [8,9,9,9,0,0,0,1]

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3= new ListNode(0);
        int carry=0;
        ListNode temp=l3;
        while(l1!=null || l2!=null || carry!=0){
            int sum=0;
            int sum1=0;
            int sum2=0;
            if(l1!=null){
                sum1+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                sum2+=l2.val;
                l2=l2.next;
            }
            
            sum=sum1+sum2+carry;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
        }
        return l3.next;

        
        
    }
}
