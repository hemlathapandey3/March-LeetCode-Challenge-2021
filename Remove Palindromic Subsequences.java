// since only 2 characters are there 'a' and 'b' so number of palindrome will never exceed 2. In case of string being a palindrome then it will be 1 and for empty string 0.

class Solution {
    public int removePalindromeSub(String s) {
        
       
        
        if(isPalindrome(s) == true && s.length()>0)
        return 1;
        
        if(s.length()==2)
        {
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(1);
            if(ch1 != ch2)
                return 2;
            else
                return 1;
        }
        
        if(s.length()==0)
            return 0;
        
        return 2;
        
    }
    
    public static boolean isPalindrome(String s)
    {
         int i = 0;
        int j = s.length()-1;
        while(i <= j)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            
            if(ch1 != ch2)
              return false;
            else
            {
                j--;
                i++;
            }
            
        }return true;
        
    }
        
}
