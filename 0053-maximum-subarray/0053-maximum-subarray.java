class Solution {
    public boolean isNegative(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }
    public int findMax(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max= Math.max(max,nums[i]);
        }
        return max;
    }
    public int maxSubArray(int[] nums) {
        if(isNegative(nums)){
            int maxSum= findMax(nums);
            return maxSum;
        }
        else{
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                currSum += nums[i];
                if(currSum<0){
                    currSum=0;
                }
                maxSum = Math.max(maxSum,currSum);
            }
            return maxSum;
        }
    }
}