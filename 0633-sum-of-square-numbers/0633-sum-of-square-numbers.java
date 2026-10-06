class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        int j = n;
        int k = 0;

        while (k <= j) {
            long sum = (long) k * k + (long) j * j;

            if (sum < c) {
                k++;
            }
            else if (sum == c) {
                return true;
            }
            else {
                j--;
            }
        }

        return false;
    }
}