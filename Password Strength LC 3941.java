 /** Input: password = "aA1!"

Output: 11

Explanation:

The distinct characters are 'a', 'A', '1' and '!'.
Thus, the strength = 1 + 2 + 3 + 5 = 11.**/
 
class Solution {
    public int passwordStrength(String password) {
        String str=password;
        int stre=0;
        for(char ch=0;ch<128;ch++){
            if(str.indexOf(ch)!=-1){
                if(ch>='a'&& ch<='z'){
                    stre+=1;
                }
                else if(ch>='A' && ch<='Z'){
                    stre+=2;
                }
                else if(ch>='0' && ch<='9'){
                    stre+=3;
                }
                else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'){
                    stre+=5;
                }
            }
        }
        
            return stre;
    }
}



