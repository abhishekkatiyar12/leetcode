class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
        
         int n=arr.length;
        TreeMap<Double, String> tree = new TreeMap<>();
   
  
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                
                double fractionValue = (double) arr[i] / arr[j];
              String str = arr[i] + "/" + arr[j];
                tree.put(fractionValue,str);
                
           }
        }
        
        String value="";
        int count=0;
        
         for (Map.Entry<Double, String> entry : tree.entrySet()) {
             count++;
             if(count==k){
             value = entry.getValue();
                 break;
             }
         }
        
       
         String[] parts = value.split("/");
       int numerator = Integer.parseInt(parts[0]);
        int denominator = Integer.parseInt(parts[1]);

       return new int[]{numerator,denominator};
            }

           

}