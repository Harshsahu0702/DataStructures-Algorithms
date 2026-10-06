class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=nums.length-1;
        int j =0;
        int m =i;
        int [] result=new int[i+1];
        while(i>=j)
        {
            if(nums[i]*nums[i]>nums[j]*nums[j])
            {
                result[m]=nums[i]*nums[i];
                i--;
            }
            else
            {
                result[m]=nums[j]*nums[j];
                j++;
            }
            m--;
        }
        return result;
    }
}