class Solution {
    public char findTheDifference(String s, String t) {
        char ch=0;                   // store xor ressult [character]
        for(int i=0;i<s.length();i++){    // taking xor of all charcaters of string s
            ch^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){   // xor of all characters of string t
            ch^=t.charAt(i);
        }
        return ch;    // only extra charcter will remains since same charcaters cancels [a^a=0]
    }
}



Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added
Input: s = "", t = "y"
Output: "y"
