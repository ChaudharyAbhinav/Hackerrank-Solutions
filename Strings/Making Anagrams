```java
public static int makingAnagrams(String s1, String s2) {
    // Write your code here
    
         Map<Character,Integer>  map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        System.out.println(map1);
        for(int i=0;i<s2.length();i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
                System.out.println(map2);

        
        Set<Character> keysToRemove1 = new HashSet<>(); 
                Set<Character> keysToRemove2 = new HashSet<>(); 

            for(char c : map1.keySet()){
                if(map2.containsKey(c)){
                  int minFreq = Math.min(map1.get(c),map2.get(c));
                    map1.put(c,map1.get(c)-minFreq);
                    map2.put(c,map2.get(c)-minFreq);
                    
                    if(map1.get(c)==0) keysToRemove1.add(c);
                    if(map2.get(c)==0) keysToRemove2.add(c);
                }
            }
                    System.out.println(map1);
                            System.out.println(map2);


            
            // System.out.println(keysToRemove);
            for(char key : keysToRemove1){
                map1.remove(key);
            }
            // System.out.println(keysToRemove);
            for(char key : keysToRemove2){
                // map1.remove(key);
                map2.remove(key);
            }
                        System.out.println(map1);
                                    System.out.println(map2);
            
            int map1Freq=0;
            for(int freq : map1.values()){
                map1Freq += freq;
            }
                    System.out.println(map1Freq);

            int map2Freq =0;
            for(int freq : map2.values()){
                map2Freq += freq;
            }
                                System.out.println(map2Freq);

            
             return map2Freq+map1Freq ;
            
    }
```


```java
public static int makingAnagrams(String s1, String s2) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        
        // Count frequencies of characters in s1
        for(char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        
        // Count frequencies of characters in s2
        for(char c : s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        
        int deletionCount = 0;
        
        // Calculate the total number of characters in both strings
        int totalCharacters = s1.length() + s2.length();
        
        // Calculate the twice the number of characters that are common to both strings
        for(char c : map1.keySet()){
            if(map2.containsKey(c)){
                deletionCount += 2 * Math.min(map1.get(c), map2.get(c));
            }
        }
        
        // Return the difference between the total characters and twice the common characters
        return totalCharacters - deletionCount;
    }
```
