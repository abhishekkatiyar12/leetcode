class Solution {
    public int countSeniors(String[] details) {
    
        int count =0;
      for(int i=0;i< details.length;i++) {
          System.out.println(details[i].charAt(11));
          System.out.println(details[i].charAt(12));
          int age1 = Integer.parseInt(String.valueOf(details[i].charAt(11)));
          int age2 = Integer.parseInt(String.valueOf(details[i].charAt(12)));
          int age = age1;
          //System.out.println("age = "+age);
          age = age * 10 + age2;
          System.out.println("age= " + age);
          if (age > 60) {
              count++;
          }
          age = 0;
      }
          System.out.println("count "+count);

     return count; 
    }
}
        
