class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        if(arr.length==1){
            if(sentence.charAt(sentence.length()-1)!=sentence.charAt(0)){
                return false;
            }
        }
        if(arr.length>1){
            
        
        for(int i=0;i<arr.length-1;i++){
            String s1=arr[i];
            String s2=arr[i+1];
            int l1=s1.length();
            int l2=s2.length();
            char ch1=s1.charAt(l1-1);
            char ch2=s2.charAt(0);
            if(ch1!=ch2){
                return false;
            }
        }
            if(sentence.charAt(sentence.length()-1)!=sentence.charAt(0)){
                return false;
            }
    }
        return true;
        
    }
}