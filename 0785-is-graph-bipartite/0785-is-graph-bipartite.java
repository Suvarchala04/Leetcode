class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                boolean res=isBipartiteUtil(graph, i, color);
                if(res==false) return false;
            }
        }
        return true;
    }
    public boolean isBipartiteUtil(int[][] graph,int src, int[] color){
        Queue<Integer> que=new LinkedList<>();
        que.add(src);
        color[src]=0;
        while(!que.isEmpty()){
            int curr=que.poll();
            for(int neigh:graph[curr]){
                if(color[neigh]==-1){
                    int nextColor = color[curr]==0 ? 1:0;
                    color[neigh]=nextColor;
                    que.add(neigh);
                }
                else if(color[neigh]==color[curr]){
                    return false;
                }
            }
        }
        return true;
    }
}