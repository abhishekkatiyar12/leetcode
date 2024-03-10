class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list2.add(nums2[i]);
        }
        System.out.println(list1);
        System.out.println(list2);
    ArrayList<Integer> result=new ArrayList<>();

    if(list1.size()<=list2.size()){
        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                if(result.contains(list1.get(i))){
                    continue;
                }else{
                    result.add(list1.get(i));
                }
            }

        }
    }

        if(list1.size()>list2.size()){
            for(int i=0;i<list2.size();i++){
                if(list1.contains(list2.get(i))){
                    if(result.contains(list2.get(i))){
                        continue;
                    }else{
                        result.add(list2.get(i));
                    }
                }

            }
        }
        System.out.println(result);
        int length=result.size();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=result.get(i);
        }
        return arr;
    }

}