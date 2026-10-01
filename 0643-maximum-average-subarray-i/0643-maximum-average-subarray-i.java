class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double sum=0;    
        double max = Double.NEGATIVE_INFINITY;
        for(int right = 0; right<nums.length;right++)
        {
            if((right-left+1)>k)
            {
                sum=sum+nums[right];
                sum=sum-nums[left];
                left++;

            }
            else
            sum=sum+nums[right];
            
            if ((right - left + 1) == k) {
                max = Math.max(max, sum);
            }
            
        }
        return max/k;
    }
}