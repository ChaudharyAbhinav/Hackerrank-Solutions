 public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
          int lc = 0, uc = 0, d = 0, sc = 0;

        for(int i=0;i<n;i++){
            if(password.charAt(i)>='a' && password.charAt(i)<='z' ) lc = 1;
            else if(password.charAt(i)>='A' && password.charAt(i)<='Z') uc=1;
            else if(password.charAt(i)>='0' && password.charAt(i)<='9') d=1;
            else sc=1;
            
        }
        int MustRemChar = 4 -  (lc+uc+d+sc);
        int temp=0;
         if(n<6){  
            temp = 6 - n;
         }
        
        return Math.max(MustRemChar,temp);
                  
   }


`TC` : O(n)
`SC` : O(1)
