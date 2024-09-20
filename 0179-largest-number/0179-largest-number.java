class Solution {
    public String largestNumber(int[] nums) {
     String[] arr=new String[nums.length];
        for(int n=0;n<nums.length;n++){
            arr[n]=String.valueOf(nums[n]);
        }
        
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String a,String b){
                String order1=a+b;
                String order2=b+a;
                return order2.compareTo(order1);
            }
        });
        
        if (arr[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        
        return sb.toString();
    }
}