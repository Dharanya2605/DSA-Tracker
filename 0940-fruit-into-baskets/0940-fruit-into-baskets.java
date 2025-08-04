class Solution {
    public int totalFruit(int[] arr) {
        int l=0,r=0,max=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        while(r<arr.length){
            if(!h.containsKey(arr[r])){
                h.put(arr[r],1);
            }else{
                h.put(arr[r],h.get(arr[r])+1);
            }

            if(h.size()>2){
                while(h.size()>2){
                    h.put(arr[l],h.get(arr[l])-1);
                    if(h.get(arr[l])==0){
                        h.remove(arr[l]);
                    }
                    l++;
                }
            }
            if(h.size()<=2){
                max=Math.max(max,r-l+1);
            }
            r++;

        }
        return max;
    }
}