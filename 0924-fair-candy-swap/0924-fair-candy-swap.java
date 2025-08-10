class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a_total=0,b_total=0;
        for(int n:aliceSizes) a_total+=n;
        for(int n:bobSizes) b_total+=n;
        int m=aliceSizes.length,n=bobSizes.length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((a_total-aliceSizes[i]+bobSizes[j])==(b_total-bobSizes[j]+aliceSizes[i])){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[0];
        
    }
}