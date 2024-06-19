class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[n + m];
        if(n == 0){
            array = nums1;
        }
        else if(m == 0){
            array = nums2;
        }
        else if (n + m != 0) {
            int p1 = 0;
            int p2 = 0;
            int p3 = 0;
            while (p1 <= m && p2 <= n){
                if (nums1[p1] > nums2[p2]){
                    array[p3] = nums2[p2];
                    p2++;
                    p3++;
                }
                else{
                    array[p3] = nums1[p1];
                    p1++;
                    p3++;
                }
            }
            if(p1 > m){
                while (p3 < n+m) {
                    array[p3] = nums2[p2];
                    p2++;
                    p3++;
                }
            }
            else{
                while (p3 < n+m) {
                    array[p3] = nums1[p1];
                    p1++;
                    p3++;
                }
            }
        }
        System.out.println(con(array));
        nums1 = array;
    }
    public static String con(int[] arr){
        if(arr.length == 0){
            return "[]";
        }
        else if(arr.length == 1){
            return ("[" + ((Integer) arr[0]).toString() + "]");
        }
        else{
            String str = "[" + ((Integer) arr[0]).toString();
            for(int i = 1; i < arr.length; i++){
                str += "," + ((Integer) arr[i]).toString();
            }

            return str + "]";
        }
    }   
}
