class Solution {
    public boolean isAnagram(String s, String t) {
        // first length of strings then, frequency of each character in both strings
        // TC SP O(s+t)
        //1st sol is HashMap
        //2nd sol is Sorting  O(n),O(1)
        if(s.length()!=t.length()){
            return false;
        }
        int[] count= new int[26];
        for(int i=0;i<s.length();i++){ // go through both strings same time
            count[s.charAt(i)-'a']++; //initially all frequency was 0 now we increase it by 1
            count[t.charAt(i)-'a']--;// now for string t we decrease frequency by 1 so that both s and t woukd cancel each other like 1,-1


        }
        for(int num:count){
            if(num!=0){ //if likeeverything doesnt cancel out then its not an anagram
                return false;
            }
        }
        return true;


    }
}
