class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        int count=0,temp;
        
      
    Arrays.sort(happiness);
    int i=happiness.length-1;
            
        // till count reamins less than k
 while(count!=k && i>=0){
      temp=happiness[i]-count;
     temp= Math.max(0,temp);
    
     ans+=temp;
     
     count++;
     i--;
     }
        return ans;
        
    }
}