class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st= new Stack<>();
        for(char ch:s.toCharArray() ){
            if(!st.isEmpty()&& st.peek()==ch ){
                st.pop();

            }
            else {
                st.push(ch);
            }
        }
        String res="";
        for(char c:st){
            res+=c;
        }
        return res;
        
    }
}
