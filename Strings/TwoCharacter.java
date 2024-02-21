
 public static int alternate(String s) {
    // Write your code here
    HashSet<Character> set = new HashSet<>();
    for(int i=0;i<s.length();i++){
        set.add(s.charAt(i));
    }
    ArrayList<Character> list = new ArrayList<>(set);
    int max=0;
    for(int i = 0 ;i<list.size()-1;i++){
        for(int j=i+1;j<list.size();j++){
            char c1=list.get(i);
            char c2=list.get(j);
            int len = helper(c1,c2,s);
            max = Math.max(len , max);
        }
    }
        return max;
    }
    
    public static int helper(char c1, char c2, String s){
        int count =0;
        char prev=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == c1 || ch==c2){
                if(prev==ch){
                    return 0;
                }
                prev=ch;
                count++;
            }
        }
        return count;
    }
}

TC : O(n^3)
SC : 2O(n) -> O(n)
