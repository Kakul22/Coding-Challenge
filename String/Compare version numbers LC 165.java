class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0;    // for traversing of version1
        int j=0;    // for traversing of version2

        // Jab tak kisi bhi version mein characters bache hain
        while(i<version1.length() || j<version2.length()){
            // Current revision number ko store karenge
            int num1=0;
            int num2=0;
            while(i<version1.length() && version1.charAt(i)!='.'){// Version1 ka current number read karo, dot tak
                 num1 = num1*10+(version1.charAt(i)-'0'); //Ye line character digit ko integer mein convert karti hai.
                 i++;
            }
            while(j<version2.length()&& version2.charAt(j)!='.'){// Version2 ka current number read karo, dot tak
                 num2 = num2*10+(version2.charAt(j)-'0');
                 j++;
            }
            if(num1 <num2){
                return -1;
            }
            if(num1>num2){
                return 1;
            }
            // Dono numbers equal hain, toh dot skip karke aage badho
            i++;  
            j++;
        }
        return 0;
    }
}



Example 1:
Input: version1 = "1.2", version2 = "1.10"                       Output: -1
Explanation:     version1's second revision is "2" and version2's second revision is "10": 2 < 10, so version1 < version2.

Example 2:
Input: version1 = "1.01", version2 = "1.001"                     Output: 0
Explanation:      Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

Example 3:
Input: version1 = "1.0", version2 = "1.0.0.0"                    Output: 0
Explanation:       version1 has less revisions, which means every missing revision are treated as "0".

 
