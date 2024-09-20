class Solution {
    public int missingNumber(int[] nums) {
        int XOR1=0;
        int n=nums.length;
        for(int i=0;i<=n;i++){
            XOR1 ^= i;
        }
        int XOR2=0;
        for(int num:nums){
            XOR2 ^= num;
        }
        return XOR1^XOR2;
    }
}