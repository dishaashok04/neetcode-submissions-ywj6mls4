class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];
        output[0]=1;
        for(int i=1;i<n;i++){
            output[i]=output[i-1]*nums[i-1];
        }
        // for right product
        int right=1; //nothing is 1
        for(int i=n-1;i>=0;i--){
            output[i]=output[i]*right;
            right=right*nums[i]; // nums[i] is given element on ith index in input array
        }
        return output;
        
    }
}  
