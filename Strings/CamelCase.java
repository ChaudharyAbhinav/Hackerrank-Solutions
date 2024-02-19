
```java
public static int camelcase(String s) {
    // Write your code here
    int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        return count+1;
    }
```

`TC` : O(n)
`SC` : O(1)
