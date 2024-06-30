class Solution {
    public int maximumLength(int[] nums) {
        // there will be four possibilitiees of sequence like all odd numbers ,all even numbers ,even-odd and odd-even 
        
        int even=0;
        int odd=0;
        int oeI=0;
        int eoI=0;
        for(int i=0;i<nums.length;i++){
            // odd numbers
            if(nums[i]%2!=0){
               odd++;
                if(oeI%2==0){
                   
                    oeI++;
                }
                if(eoI%2!=0){
                    eoI++;
                }
            }
            // even numbers
            else{
                even++;
                if(oeI%2!=0){
                    oeI++;
                }
                if(eoI%2==0){
                    eoI++;
                }
            }
        }
        int result=Math.max(even,odd);
        result=Math.max(result,oeI);
        result=Math.max(result,eoI);
        return result;
    }
}