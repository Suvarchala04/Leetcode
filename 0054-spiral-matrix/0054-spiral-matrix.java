class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int startRow=0,endRow=n-1;
        int startCol=0,endCol=m-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                res.add(matrix[startRow][j]);
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++){
                res.add(matrix[i][endCol]);
            }
            endCol--;
            if(startRow<=endRow){
                for(int j=endCol;j>=startCol;j--){
                    res.add(matrix[endRow][j]);
                }
            }
            endRow--;
            if(startCol<=endCol){
                for(int i=endRow;i>=startRow;i--){
                    res.add(matrix[i][startCol]);
                }
            }
            startCol++;
        }
        return res;
    }
}