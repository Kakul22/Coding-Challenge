class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> charIndex = new HashMap<>(); 
        int left=0;    // curr window (bina-repeat wali substring) ka start point
        int maxlen=0;  // larger point 
        for (int right= 0;right< s.length();right++) {  // string ko ek-ek character karke dekhte hain, left se right.
            char c = s.charAt(right);
            if (charIndex.containsKey(c) && charIndex.get(c) >= left) {
                left = charIndex.get(c) + 1;
            }
            charIndex.put(c,right);  // Har character ki latest position hamesha update
            maxlen = Math.max(maxlen,right-left+1); // right-left+1 = current window ki length.
        }
        return maxlen;
    }
}


Simple example: "abba"

right=0: a → naya hai → window = "a"
right=1: b → naya hai → window = "ab"
right=2: b → pehle se hai (index 1), aur wo window ke andar hai → left ko 1+1=2 kar do → window = "b"
right=3: a → pehle dikha tha index 0 pe, lekin wo ab window (jo left=2 se start hota hai) ke bahar hai → isliye repeat nahi maana jayega → window = "ba"

Example 1:        Input: s = "abcabcbb"
                  Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:        Input: s = "bbbbb"
                  Output: 1
Explanation: The answer is "b", with the length of 1.
