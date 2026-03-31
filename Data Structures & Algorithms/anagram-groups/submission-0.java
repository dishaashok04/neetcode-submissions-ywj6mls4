class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String s:strs){ // for every string in array of string like act , cat
            int[] freq=new int[26]; // create freq array
            for(char c: s.toCharArray()){ // each char in string after converting string into array
                freq[c-'a']++; // converts char to indices i.e a has ascii value 97 b 98 then we increment freq of that character

            }
            StringBuilder keyBuilder= new StringBuilder();
            for(int count:freq){
                keyBuilder.append('#').append(count);// #1#0#1#1 something like this we use StringBuilder as Key because freq array cant be taken as key in Hashmap
            }
            String key=keyBuilder.toString();
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());     
        
    }
}
