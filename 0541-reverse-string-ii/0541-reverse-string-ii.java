class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        int len=s.length();
        
        for(int i=0;i<s.length();i+=2*k){
            int start=i;
            int end=i+(k-1)>=len? len-1:i+(k-1);

            while(start<end){
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }

        }
        return new String(ch);
        
    }
}