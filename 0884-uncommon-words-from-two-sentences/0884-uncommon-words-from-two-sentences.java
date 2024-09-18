class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String[] s11=s1.split(" ");
        String []s12=s2.split(" ");
        for(String s:s11){
             map.put(s, map.getOrDefault(s, 0) + 1);
        }
                for(String s:s12){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        ArrayList<String> list=new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
         String s=entry.getKey();
            int num=entry.getValue();
            if(num==1){
                list.add(s);
            }
        }
        String [] answer=new String[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}