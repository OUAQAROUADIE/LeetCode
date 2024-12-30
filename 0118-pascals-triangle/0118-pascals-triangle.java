class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        if(numRows == 0){return result;}
        l1.add(1);
        result.add(l1);
        for(int i = 1 ; i < numRows ; i++ ){
            List<Integer> l= new ArrayList<>();
            l.add(1);
            for(int j = 1 ; j  < i ;j++){
                l.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            l.add(1);
            result.add(l);
            }
            return result;

        }
    
}