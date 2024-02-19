class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int count=0;
        ArrayList<Integer>list= new ArrayList<>();
      for(int i=0;i<nums.length;i++) {
          if (nums[i] == 1) {
              count++;
          } else {
              list.add(count);
              count = 0;
          }
          if (i == nums.length - 1) {
              list.add(count);
          }
      }
      
        int max = list.get(0); // Initialize max with the first element

        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                max = current;
            }
        }
        System.out.println("maximum = "+max);
      return max;

    }
}
    