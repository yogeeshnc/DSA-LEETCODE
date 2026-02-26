class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length -1;
        int max_water=0;
        while(lp<rp){
            int width=rp-lp;
            int ht=(height[lp]<height[rp])?height[lp]:height[rp];
            int container=width*ht;
            max_water=(max_water<container)?container:max_water;
            if (height[lp] < height[rp]) {
    lp++;
} else {
    rp--;
}
        }

        return max_water;
    }
}