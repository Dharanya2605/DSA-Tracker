class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int[] arr:trust){
            int a=arr[0];
            int b=arr[1];
            list.get(a).add(b);
        }
        for(int i=1;i<=n;i++){
            boolean flag=true;
            if(list.get(i).size()==0){
                for(int j=1;j<=n;j++){
                if(i==j){
                    continue;
                }
                if(list.get(j).contains(i)){
                    continue;
                }else{
                    flag=false;
                   // break;
                }
            }
            if(flag){
                return i;
            }

           }

            
        }
        return -1;
        
    }
}