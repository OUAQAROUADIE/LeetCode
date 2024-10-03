class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows; i++ ){
            List<Integer> list = new ArrayList<>();
            list.add(1);

            for(int j = 1 ; j < i ; j++){
                int val = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                list.add(val);
            }
            if(i > 0){
            list.add(1);
            }
            result.add(list);

        }
        return result;
    }
}