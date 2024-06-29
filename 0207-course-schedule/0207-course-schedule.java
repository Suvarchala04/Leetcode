class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph[u].add(v);
        }
        int[] indegree=new int[numCourses];
        calculateInDegree(graph,indegree);
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int cnt=0;
        while(!que.isEmpty()){
            int curr=que.remove();
            res.add(curr);
            for(int i: graph[curr]){
                indegree[i]--;
                if(indegree[i]==0){
                    que.add(i);
                }  
            }
        }
        return res.size()==numCourses;
    }
    public void calculateInDegree(ArrayList<Integer>[] graph,int[] indegree){
        for(int i=0;i<graph.length;i++){
            for(int j:graph[i]){
                indegree[j]++;
            }  
        }
    }
}