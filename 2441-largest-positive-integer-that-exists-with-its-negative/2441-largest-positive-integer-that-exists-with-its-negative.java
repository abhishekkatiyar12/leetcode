class Solution {
    public int findMaxK(int[] nums) {
        
//         Integer[] integerArray = new Integer[nums.length];

        
//         for (int i = 0; i < nums.length; i++) {
//             integerArray[i] = Integer.valueOf(nums[i]); // Auto-boxing
//         }
        
        ArrayList<Integer>list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(Integer.valueOf(nums[i]));
        }
        // System.out.println(list);
       Collections.sort(list, Collections.reverseOrder());
        for(int i=0;i<list.size();i++){
            if(list.contains(-list.get(i))){
                
               return list.get(i);
            }
        }
          return -1;
    }
}
    