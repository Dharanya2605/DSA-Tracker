class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,i=0,j=0;
        while(i<s.length && j<g.length){
            if(s[i]>=g[j]){
                c++;
                i++;
                j++;
            }else{
                i++;
            }
        }
        return c;
        
    }
}