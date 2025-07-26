class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0;
        int l_max=0;
        int r_max=0;
        while(left<right){
            if(height[left]<height[right]){
                l_max=Math.max(l_max,height[left]);
                res+=l_max-height[left];
                left++;
            }else{
                r_max=Math.max(r_max,height[right]);
                res+=r_max-height[right];
                right--;
            }
        }
         return res;
    }
}