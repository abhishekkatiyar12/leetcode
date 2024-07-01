class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            odd++;
            
        }else{
           odd=0;
        }
            if(odd==3){
                return true;
            }
        }
        return false;
    }
}