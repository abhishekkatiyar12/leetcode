class Solution {
    public int removeElement(int[] nums, int val) {
    int k=0;
            int num[]=new int[100];
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    k++;
                    num[j++]=nums[i];
                }
            }       
        System.out.println("");
            for(int i=0;i<k;i++){
                nums[i]=num[i];
            }
       
            return k;
        }
    }
