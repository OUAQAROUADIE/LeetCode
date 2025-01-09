class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0,j=0;
        while(i<m){
            nums1[i] = nums1[j];
            i++;
            j++;
        }
        j=0;
        while(i<m+n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
    }
}