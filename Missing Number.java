class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int ans=0;
        int flag=0;
        int len = nums.length;
        for(int i = 0;i<len;++i)
        {
            if(nums[i]!=i)
            {
                ans=i;
                flag=1;
                break;
            }
                
        }
        if(flag==0)
            ans=len;
        
        return ans;
        
    }
}
