class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int length= nums1.length;
        length+= nums2.length;
        int[] sorted=new int[length];
        for(int i=0;i<length;i++){
            if(i<nums1.length){
            sorted[i]=nums1[i];
            }if(i>=nums1.length){
                sorted[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(sorted);
        if(length%2==0) {
            int median1 = length / 2;
            int median2 = median1 - 1;
            float median=(float)(sorted[median2] + sorted[median1]) / 2;
            return median;
        }else{
            return (float)(sorted[length/2]);
        }
    }

}
