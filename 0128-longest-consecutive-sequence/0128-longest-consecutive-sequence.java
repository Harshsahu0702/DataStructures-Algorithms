class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int MaxLength=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int length=1;
                int curr=num;
                while(set.contains(curr+1))
                {
                    curr++;
                    length++;
                }
                MaxLength=Math.max(MaxLength,length);
            }
        }
        return MaxLength;
    }
}