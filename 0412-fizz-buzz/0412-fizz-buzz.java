class Solution {
    public List<String> fizzBuzz(int n) {
    
        ArrayList<String> list= new ArrayList<>();
     
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add(i-1,"FizzBuzz");
            } else if (i%3==0) {
                list.add(i-1,"Fizz");
            } else if (i%5==0) {
                list.add(i-1,"Buzz");
            }else{
                String add= String.valueOf(i);
                list.add(i-1,add);
            }

        }
        System.out.println(list);
        return list;
    }
}