class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int i =0;
        while(i < m){
            nums1[j] = nums1[i];
            j++;
            i++;
        }
        i=0;
        j=m;
        while(i < n){
            nums1[j]=nums2[i];
            j++;
            i++;
        }
        Arrays.sort(nums1);
       
    }
}