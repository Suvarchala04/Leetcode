class Solution {
    public long findMax(int[] piles){
        long max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
    public long findHours(int[] piles,long mid){
        long hrs=0;
        for(int i=0;i<piles.length;i++){
            hrs += (long)Math.ceil((double)piles[i]/mid);
        }
        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long low=1,high=findMax(piles);
        long ans=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            long hrs=findHours(piles,mid);
            if(hrs<=h){
                high=mid-1;
                ans=mid;
            }
            else if(hrs>h)  low=mid+1;
        }
        return (int)ans;
    }
}