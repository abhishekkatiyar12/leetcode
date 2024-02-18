class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean result=false;
        for(int i=0;i<arr.length;i++){
          int current=arr[i];
           for(int j=0; j<arr.length;j++){
               if(i==j){
                   continue;
               }
               if(arr[i]==2*arr[j]){
                  result=true;
                   break;
               }
           }
      }
        // System.out.println("false");
        return  result;
    }
}
    