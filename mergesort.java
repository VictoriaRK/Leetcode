class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[n + m];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 <= m && p2 <= n){
            if (nums1[p1] > nums2[p2]){
                array[p3] = nums2[p2];
                p2++;
            }
            else{
                array[p3] = nums1[p1];
                p1++;
                p3++;
            }
        }
        if(p1 > m){
            while () {

            }
        }
        else{
            while () {

            }
        }
    }
}
