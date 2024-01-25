class Solution {
    public int mostWordsFound(String[] s) {
        
        
        
        
//         public class Main {
//     public static void main(String[] args) {


//         String[] s=new String[]{"please wait", "continue to fight", "continue to win"};
        System.out.println("length = "+s.length);
        int[] x=new int[s.length];
        int count=0;
       for(int i=0;i<s.length;i++) {
           String s1=s[i];
           for(int j=0;j<s1.length();j++){
               if(s1.charAt(j)==' '){
                   System.out.println("space found for i= "+i );
                   count++;
               }
           }
           x[i]=count+1;
           count=0;
       }int max=0;
       for(int i=0;i<x.length;i++){
           if(max<x[i]){
               max=x[i];
           }
       }

        System.out.println(max);
        return max;

    }
}
        
