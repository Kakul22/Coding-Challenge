Example 1: Input: s = "babad"   Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2: Input: s = "cbbd"    Output: "bb"


class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int left=i;
            int right=i;
            while(left>=0 && s.charAt(left)==c){
                left--;
            }
            while(right<n && s.charAt(right)==c){
                right++;
            }
            while(left>=0&& right<n){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                left--;
                right++;
            }
            left=left+1;
            if(end-start<right-left){
                start=left;
                end=right;

            }
        }
        return s.substring(start,end);
    }
}
