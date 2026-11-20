class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rightSum = 0;
        int maxSum = 0;
        int leftSum = 0;

        for(int i = 0; i < k; i++){
            leftSum = leftSum + cardPoints[i];
        }

        maxSum = leftSum;

        for(int i = 0; i < k; i++){
            leftSum = leftSum - cardPoints[k - 1 - i]; // last index sai remove krne ki liye.
            rightSum = rightSum + cardPoints[cardPoints.length - 1 - i];

            maxSum = Math.max(maxSum , rightSum + leftSum);
        }
        return maxSum;
    }
}