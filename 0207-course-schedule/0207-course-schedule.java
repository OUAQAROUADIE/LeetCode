class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] degree = new int[numCourses];

        for(int  i = 0 ; i < numCourses; i++ ){
            graph.add(new ArrayList<>());
        }

        for(int[] pre :prerequisites ){
            int a  = pre[0];
            int b = pre[1];

            graph.get(b).add(a);
            degree[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < numCourses ; i++){
            if(degree[i] == 0){
                q.offer(i);
            }
        } 
        int p = 0;
        while(!q.isEmpty()){
            int course = q.poll();
            p++;

            for(int next : graph.get(course)){
                degree[next]--;
                if(degree[next] == 0){
                    q.offer(next);
                }
            }
        }
        return p == numCourses;
    }
}