class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int positive=0,negative=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[negative++]=nums[i];
            }
            else{
                pos[positive++]=nums[i];
            }
        }
        int m=0;
        int l=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[m];
                m++;
            }
            else{
                nums[i]=neg[l];
                l++;
            }
        }
        return nums;
    }
}