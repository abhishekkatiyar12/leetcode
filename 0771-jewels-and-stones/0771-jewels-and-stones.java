class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        // convertng the jewels string to list
        
        List<Character> jewellist = new ArrayList<>();

        for (char c : jewels.toCharArray()) {
            jewellist.add(c);
        }

      
        // convertng the stones string to list
        List<Character> stonesList = new ArrayList<>();

        for (char c : stones.toCharArray()) {
            stonesList.add(c);
        }
       
        int count=0;
        
        // checking if stines item is in jewels if contains increase count an reduce i to check the element which comes  in place of i after removinf i
        
      for(int i=0;i<stonesList.size();i++){
          if(jewellist.contains(stonesList.get(i))){
              count++;
              stonesList.remove(i);
              i--;
          }
      }
       
        return count;
    }
}