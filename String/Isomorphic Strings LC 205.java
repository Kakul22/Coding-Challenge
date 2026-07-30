class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Character> mp2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(mp1.containsKey(c1)){
                if(mp1.get(c1)!=c2)
                    return false;
            }
            else{
                mp1.put(c1,c2);
            }
            if(mp2.containsKey(c2)){
                if(mp2.get(c2)!=c1)
                    return false;
            }
            else{
                mp2.put(c2,c1);
            }
        }
        return true;

    }
}


Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "f11", t = "b23"

Output: false

Explanation:

The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.
