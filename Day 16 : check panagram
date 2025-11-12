// check panagram : a string contains all the letters of english alphabets
class Solution {

    public static boolean isPanagram(String str) {
        str=str.toLowerCase();
        boolean[] present=new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                present[ch-'a']=true;             // mark the letter found
            }
        }
        for(int i=0;i<26;i++){                      // check if all 26 letters are present or not 
            if(!present[i]){
                return false;
            }
          
            
        }
        return true;
        
    
}

}
