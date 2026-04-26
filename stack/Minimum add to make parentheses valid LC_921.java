class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st= new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    count++;
                }
                else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            count++;
            st.pop();
        }
        return count;
    }
}




///  second method using string //

class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int res=0;

        for (char c:s.toCharArray()) {
            if (c == '(') {
                open++;
            } 
            else{
                if(open>0){
                    open--;   
                }
                else{
                    res++;    
                }
            }
        }
        return res + open; 
    }
}
