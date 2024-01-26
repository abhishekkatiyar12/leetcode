class Solution {
    public String interpret(String command) {
    
      String result="";
      for(int i=0;i<command.length();i++){
          //System.out.println("i= "+ i+ " "+ command.charAt(i));
          if(command.charAt(i)=='G'){
              result+="G";
          //    System.out.println("found G");
          } else if (command.charAt(i)=='(' && command.charAt(i+1)==')') {
              result+="o";
         //     System.out.println("found ()");
              i++;
          }else {
              result+="al";
              i+=3;
          }

      }
      //  System.out.println(result);
        return result;
    }
}