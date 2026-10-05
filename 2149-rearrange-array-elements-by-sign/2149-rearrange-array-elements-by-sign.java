class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a=0,b=1;
        int[] result = new int[nums.length];
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                result[b++]=nums[i];
                b++;
            }
            else
            {
                result[a++]=nums[i];
                a++;
            }
        }
        return result;
        
    }
}