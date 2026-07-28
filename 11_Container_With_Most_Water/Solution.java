class Solution {
    public int maxArea(int[] height) {
        int area =  0, right = height.length - 1, left = 0;

        while(left<right){
            int minHeight = Math.min(height[right],height[left]);
            int width = right-left;
            area = Math.max(area, width * minHeight);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}