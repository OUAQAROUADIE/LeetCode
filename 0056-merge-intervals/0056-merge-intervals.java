class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for(int[] inter : intervals){
            if(result.isEmpty() || result.get(result.size()-1)[1] < inter[0]){
                result.add(inter);
            }else{
                result.get(result.size()-1)[1] =Math.max(result.get(result.size()-1)[1], inter[1]);
            }
        }
        return result.toArray(new int[result.size()][]);

        
        
    }
}