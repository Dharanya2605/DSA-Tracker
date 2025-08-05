class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0,sum=0;
        for(int i=0;i<fruits.length;i++){
            int val=fruits[i];
            c=1;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    c=0;
                    baskets[j]=0;
                    break;
                }
                
            }
            sum+=c;
        }
        // for(int i=0;i<fruits.length;i++){
        //     System.out.print(fruits[i]+" ");
        // }
        return sum;
    }
}