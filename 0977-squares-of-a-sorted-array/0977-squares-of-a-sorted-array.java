class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+" ");

        }
        return nums;
    }
}