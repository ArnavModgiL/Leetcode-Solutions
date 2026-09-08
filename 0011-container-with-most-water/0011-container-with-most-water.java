class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int width = right - left;
            int containerHeight = Math.min(height[left], height[right]);
            int containerArea = width * containerHeight;

            maxArea = Math.max(maxArea, containerArea);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}