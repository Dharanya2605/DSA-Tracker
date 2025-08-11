class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> list=new ArrayList<>();
        int res[]=new int[queries.length];
        int mod=(int)1000000007;
       // list.add(i);
        int power = 1;
        int temp = n;
        while (temp > 0) {
            if (temp % 2 == 1) {  
                list.add(power);
            }
            power *= 2;
            temp /= 2;
        }
        int k=0;
        for(int[] arr:queries){
            int start=arr[0];
            int end=arr[1];
            long val=1;
            for(int j=start;j<=end;j++){
                val=(val*list.get(j)) %mod;
            }
            res[k++]=(int)val;
        }
        return res;
    }
}