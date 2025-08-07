class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           list.add(index[i],nums[i]);
        }
        int i=0;
        for(int n:list){
            target[i]=list.get(i);
            i++;

        }
        return target;

        
    }
}