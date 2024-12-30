class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        if(rowIndex ==0 ){return l;}
        for(int i = 1 ; i <= rowIndex ;i++){
            l.add(0);
            for(int j = i ; j>0;j--){
                l.set(j, l.get(j)+l.get(j-1));
            }

        }
        return l;
    }
}