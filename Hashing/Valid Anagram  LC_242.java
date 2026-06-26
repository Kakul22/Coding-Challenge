class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map= new HashMap<>();  // charcter aur uski frequency k lie 
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);   //if ch is present in map then return ch & ifnot then return 0 (as its frequency)
        }
        for(char ch:t.toCharArray()) {
            if(!map.containsKey(ch)) {
                return false;
            }
            map.put(ch,map.get(ch)-1);   // decrease frequency by 1 
            if(map.get(ch)==0){    // if freq of any any charcter becomes 0 then   
               map.remove(ch);          //  remove it from the map
            }
        }
        return map.isEmpty();   // if all chars match then map will be empty hence retrun true;


    }
}

Input: s = "anagram", t = "nagaram"
Output: true
Input: s = "rat", t = "car"
Output: false
