class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        // Take all k cards from the right initially
        int sum = 0;

        for (int i = n - k; i < n; i++) {
            sum += cardPoints[i];
        }

        int max = sum;

        // Gradually replace right cards with left cards
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
            sum -= cardPoints[n - k + i];

            max = Math.max(max, sum);
        }

        return max;
    }
}