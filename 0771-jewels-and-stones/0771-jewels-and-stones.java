class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        List<Character> jewellist = new ArrayList<>();

        for (char c : jewels.toCharArray()) {
            jewellist.add(c);
        }

       // String stones="aAAbbbb";
        List<Character> stonesList = new ArrayList<>();

        for (char c : stones.toCharArray()) {
            stonesList.add(c);
        }
        //System.out.println(stonesList);
        int count=0;
      for(int i=0;i<stonesList.size();i++){
          if(jewellist.contains(stonesList.get(i))){
              count++;
              stonesList.remove(i);
              i--;
          }
      }
       // System.out.println(count);
       // System.out.println(stonesList);
        return count;
    }
}