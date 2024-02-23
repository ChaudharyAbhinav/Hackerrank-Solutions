
    public static int palindromeIndex(String s) {
    // Write your code here
        if(isPalindrome(s)) return -1;
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                if(isPalindrome(s.substring(0,start)+s.substring(start+1))) return start;
                if(isPalindrome(s.substring(0,end)+s.substring(end+1))) return end;
            }else{
                start++;end--;
            }
        }
        
        return -1;
    }
    public static boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
