class Solution {
    public String largestGoodInteger(String num) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<=9;i++){
            list.add(String.valueOf(i).repeat(3));
        }
        for(int i=list.size()-1;i>=0;i--){
            if(num.contains(list.get(i))){
                return list.get(i);
            }
        }
        return "";
        
    }
}