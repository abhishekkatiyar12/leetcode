class Solution {
    public int[] singleNumber(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
          if( map.containsKey(nums[i])){
            int value=map.get(nums[i]);
            value+=1;
            map.replace(nums[i],value);
        }else{
            map.put(nums[i],1);
        }
    }
        int[] result=new int[2];
        int count=0;
          for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
               
                result[count]=entry.getKey();
               count++;
    
            }
              if(count==2){
                  return result;
              }
        }
        return result;
    }
}