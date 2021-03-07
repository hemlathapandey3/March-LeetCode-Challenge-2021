class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Arrays.sort(nums);
        int[] ans = new int[2];
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1] == nums[i])
            {
                ans[0] = nums[i];
            }
        }
        
        int[] temp = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
               temp[k++]=nums[i];
            }
           
        }
        temp[k++]=nums[nums.length-1];
        
        
        for(int i=1;i<=nums.length;++i)
        {
            if(temp[i-1] != i)
            {
                ans[1] = i;
                break;
            }
        }
        
        
        
        return ans;
        
    }
}
