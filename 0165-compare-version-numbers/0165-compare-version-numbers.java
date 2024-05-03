class Solution {
    public int compareVersion(String version1, String version2) {
      ArrayList<Integer>list1 =new ArrayList<>();
        ArrayList<Integer>list2 =new ArrayList<>();
    
          String s1="";
      for(int i=0;i<version1.length();i++){
          if(version1.charAt(i)=='.'){
              list1.add((Integer.valueOf(s1)));
            
              s1="";
          }else{
             
              s1+=version1.charAt(i);
          }if(i==version1.length()-1){
              list1.add((Integer.valueOf(s1)));
          }
      }
      
      s1="";
        for(int i=0;i<version2.length();i++){
            if(version2.charAt(i)=='.'){
                list2.add((Integer.valueOf(s1)));
                
                s1="";
            }else{
               
                s1+=version2.charAt(i);
            }if(i==version2.length()-1){
                list2.add((Integer.valueOf(s1)));
            }
        }
        int count=0;
     int length= Math.min(list1.size(), list2.size());
        for(int i=0;i<length;i++){
             if (list1.get(i)<list2.get(i)) {
               return -1;
               
            } else if (list1.get(i)>list2.get(i)) {
                return 1;
            }else{
                 count++;
             }


        }
        if(count==length){
        
         ArrayList<Integer> largest=new ArrayList<Integer>();

        if(list1.size()<list2.size()){
            largest=list2;
        }else if(list1.size()>list2.size()) {
            largest=list1;
        }else if(list1.size()==list2.size()){
            System.out.println("returning 0");
            return 0;
        }
        
            for (int i = length; i < largest.size(); i++) {
                      if(largest.get(i)>0){
                          if(largest==list1){
                             return 1;
                          } else if (largest==list2) {
                              return -1;
                          }else{
                              return 0;
                          }
                      }
            }
        }


return 0;



        
    }
}
    