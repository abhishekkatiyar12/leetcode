class Solution {
    public int findMaxK(int[] nums) {
        
        Integer[] integerArray = new Integer[nums.length];

        
        for (int i = 0; i < nums.length; i++) {
            integerArray[i] = Integer.valueOf(nums[i]); // Auto-boxing
        }
        
        ArrayList<Integer>list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        // System.out.println(list);
        Arrays.sort(integerArray, Collections.reverseOrder());
        for(int i=0;i<integerArray.length;i++){
            if(list.contains(-integerArray[i])){
                
               return integerArray[i];
            }
        }
          return -1;
    }
}
    