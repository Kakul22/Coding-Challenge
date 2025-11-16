// first unique  character in a string
class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
        
    }
}

///// SECOND METHOD //////////////////////////////////////////////////////////////////////

class Solution {
    public char nonRepeatingChar(String s) {
        int[] freq= new int[26];
        
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            
        }
        for(char ch:s.toCharArray()){
            if(freq[ch-'a']==1){
                return ch;
            }
        }
        return '$';
        // code here
        
    }
}
