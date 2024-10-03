class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        for(int i = 0 ; i <= rowIndex ; i++ ){
            List<Integer> newlist = new ArrayList<>();
            newlist.add(1);

            for(int j = 1 ; j < i ; j++ ){
                int val = list.get(j-1) + list.get(j);
                newlist.add(val);
            }
            if(i > 0){
            newlist.add(1);
            }
            list = newlist;
        }
        return list;

    }
}