class Solution {
    public void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       
    }
    public int[][] transpose(int[][] matrix,int r,int c){
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] transposeMat=transpose(matrix,r,c);
        for(int i=0;i<transposeMat.length;i++){
            reverse(transposeMat[i]);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=transposeMat[i][j];
            }
        }
    }
}