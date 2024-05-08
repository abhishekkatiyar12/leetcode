class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int length=score.length;
        
        // stroing the score array to another array
        int[] num= new int [length];
        for(int i=0;i<length;i++){
           num[i]=score[i];
        }
        
        // sorting the array
        Arrays.sort(num);
        
        
         Map<Integer, Integer> scoreMap = new HashMap<>();
        int count=1;
        // storing it in hashmap
        for(int i=length-1;i>=0;i--){
            scoreMap.put(num[i],count);
            count++;
        }
        String[] str=new String[length];
        for(int i=0;i<length;i++){
                int integer=score[i]; 
            int rank=scoreMap.get(integer);
            if(rank==1){
                str[i]="Gold Medal";
            }else if(rank==2){
                str[i]="Silver Medal";
            }else if(rank==3){
                str[i]="Bronze Medal";
            }else{
                str[i]=String.valueOf(rank);
            }
        }
        return str;
        
    }
}