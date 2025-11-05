// valid anagram 
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){              // if the lengths are not equal both the strings then it cannot be anagram 
            return false;
        }
        char[] sArray = s.toCharArray();             // convert the string's character to char array
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);                          
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);               // check if both the sorted arrays are equal or not and according to that return te boolean value
        
    }
}
