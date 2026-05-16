class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length-1;
        Set<Integer> arr = new HashSet<>();
        boolean m = false;
        for (int num:nums) {
            if (num>n){
                return false;
            }
            if (arr.contains(num)) {
                if (num<n||m){
                    return false;
                }
                m=true;
                continue;
            }

            arr.add(num);
        }

        return true;
    }
}
