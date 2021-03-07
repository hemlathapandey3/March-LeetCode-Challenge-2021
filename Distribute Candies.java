class Solution {
    public int distributeCandies(int[] candyType) {
        
        Arrays.sort(candyType);
        
        int unique=1;
        for(int i=0;i<candyType.length-1;i++)
        {
            if(candyType[i]!=candyType[i+1])
                unique++;
        }
        int m = candyType.length/2;
        
        if(m<unique)
            return m;
        else
            return unique;
        
    }
}
