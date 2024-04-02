class Solution {
    public int maxArea(int[] height) {
        int water=0,left=0,right=height.length-1;
        while(left<right){
           int minheight=Math.min(height[left],height[right]);
           int curr=minheight*(right-left);
           water=Math.max(water,curr);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return water;
    }
}