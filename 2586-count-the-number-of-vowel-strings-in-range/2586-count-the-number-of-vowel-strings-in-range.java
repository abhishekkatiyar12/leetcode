class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String a = "";
        int count =0;
        // int left =0;
        // int right=5;
        for (int i = left; i <= right; i++)  {
            a = words[i];
            boolean result=leftchecker(a);
            if(result){
               // System.out.println(a);
                count++;
            }
        }
        System.out.println(count);
        return count;
    }


    public static boolean leftchecker(String a) {
        int left=0;
        if (a.charAt(left) == 'a') {
            System.out.println("found a in left");
            return rightchecker(a);
        } else if(a.charAt(left) == 'e') {
            System.out.println("found e in left");
            return rightchecker(a);
        } else if(a.charAt(left) == 'i') {
            System.out.println("found i in left");
            return rightchecker(a);
        } else if(a.charAt(left) == 'o') {
            System.out.println("found o in left");
            return rightchecker(a);
        } else if(a.charAt(left) == 'u') {
            System.out.println("found u in left");
            return rightchecker(a);
        }
        return false;
    }
    public static boolean rightchecker(String a) {
        int right=a.length()-1;
        if (a.charAt(right) == 'a') {
            return true;
        }
        if (a.charAt(right) == 'e') {
            return true;
        }
        if (a.charAt(right) == 'i') {
            return true;
        }
        if (a.charAt(right) == 'o') {
            return true;
        }
        if (a.charAt(right) == 'u') {
            return true;
        }
        return false;
    }
}