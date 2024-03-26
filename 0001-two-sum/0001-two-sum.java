class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int rem=target-curr;
            if(hm.containsKey(rem)){
                int idx=hm.get(rem);
                return new int[]{i,idx};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
        
    }
}