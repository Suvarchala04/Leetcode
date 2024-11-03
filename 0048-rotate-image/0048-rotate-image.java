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
    public void transpose(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        transpose(matrix,r,c);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
        
    }
}