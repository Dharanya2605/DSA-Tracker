class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res=new StringBuilder();
        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            res.append((char)('A'+rem));
            columnNumber=(columnNumber-1)/26;
        }
        res.reverse();
        return res.toString();
    }
}