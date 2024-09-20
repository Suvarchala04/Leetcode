class Solution {
    public boolean linearSearch(int idx,int n,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(i!=idx && nums[i]==n){
                return true;
            }
        }
        return false;
    }
    public int singleNumber(int[] nums) {
        int res=-1;
        for(int i=0;i<nums.length;i++){
            if(!linearSearch(i,nums[i],nums)){
                res=nums[i];
                break;
            }
        }
        return res;
    }
}