class Solution {
    public int pivotInteger(int n) {
        int pivot=-1;
        int sum=0;
       for(int i=1;i<=n;i++){
           sum+=i;
       }
        // System.out.println("sum= " +sum);
       
       if(n==1){
           // System.out.println("-----------sum is equal-----------");
           return n;
                  }
       int leftsum=1;
       int rightsum=sum;
       for(int i=2;i<=n;i++){
           leftsum+=i;
          rightsum= rightsum-(i-1);
         if(rightsum==leftsum){
            // System.out.println("pivot found at "+i);
          return i;
         }
       }
        return pivot;
    }
    
}