class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();// key is number and value is frequency
        for(int num:nums){ // for each loop for count frequency of each number.
            map.put(num,map.getOrDefault(num,0)+1);//map empty → num=1 → getOrDefault(1,0) = 0 → +1 = 1
//            map now contains {1:1(count)} 

        }
        List<Integer>[] buckets=new List[nums.length+1];
        for(int num:map.keySet()){// map.keySet() gives all unique numbers we stored..so the loop runs for the times= unique elements
            int freq=map.get(num);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();// if buckets is null which is initially then we will create a list

            }
            buckets[freq].add(num);// if bucket isnt null then here num gets added

        }
        // until now we have found all frequencies now we have to create array of size k to store
        int[] result=new int[k];
        int index=0;
        for(int i=buckets.length-1;i>=0 && index<k;i--){
            if(buckets[i]!=null){
                for(int num:buckets[i]){
                    result[index++]=num;
                    if(index==k) break;
                }
            }
        }
        return result;
        
    }
}
