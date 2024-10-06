class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] arr=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            arr[i]=new StringBuilder();
        }
        
        int count=0;
        int len=s.length();
        
       while(count<len){
           
           for(int i=0;i<numRows && count<len;i++){
               arr[i].append(s.charAt(count));
               count++;
           }
             for(int i=numRows-2;i>=1 && count <len;i--){
               arr[i].append(s.charAt(count));
                 count++;
           }
       }
        
        
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<numRows;i++){
            sb.append(arr[i]);
        }
        return String.valueOf(sb);
    }
}