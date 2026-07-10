class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String val : strs){
            char arrchar[]=val.toCharArray();
            Arrays.sort(arrchar);
            String s = new String(arrchar);
            if(!mp.containsKey(s)){
                mp.put(s,new ArrayList<>());
            }
            mp.get(s).add(val);
        }
        return new ArrayList<>(mp.values());
        
        
}
}



