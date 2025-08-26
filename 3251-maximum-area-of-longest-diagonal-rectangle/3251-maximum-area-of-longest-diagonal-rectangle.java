class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=-1;
        int res=0;
        for(int[] arr:dimensions){
            int p1=arr[0];
            int p2=arr[1];
            int val=(p1*p1)+(p2*p2);
            double len=Math.sqrt(val);
            if(len>max){
                max=len;
                res=p1*p2;
            }else if(len==max){
                res=Math.max(res,p1*p2);
            }
        }
        return res;
    }
}