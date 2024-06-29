class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j:graph[i]){
                adj.get(j).add(i);
                indegree[i]++;
            }
        }
        System.out.println(adj);
        System.out.println(Arrays.toString(indegree));
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!que.isEmpty()){
            int curr=que.remove();
            res.add(curr);
            for(int neigh:adj.get(curr)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    que.add(neigh);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}