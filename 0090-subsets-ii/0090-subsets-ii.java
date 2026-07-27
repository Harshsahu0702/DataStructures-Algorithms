import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(0, nums, curr, ans);

        return ans;
    }

    private void backtrack(int start, int[] nums, List<Integer> curr, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate elements at the same recursion level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            curr.add(nums[i]);

            backtrack(i + 1, nums, curr, ans);

            curr.remove(curr.size() - 1);
        }
    }
}