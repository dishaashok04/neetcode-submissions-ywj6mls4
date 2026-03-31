class Solution {
    public boolean hasDuplicate(int[] nums) {
        // bruteforce not preferred so use sorting but best is hashset
        // TC O(n) SC O(n)
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num); // add that num into hashset if not duplicate

        }
        return false;// if no duplicate

        
    }
}