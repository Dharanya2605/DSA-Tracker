class Solution {
    public char slowestKey(int[] arr, String s) {
        int max=arr[0];
        char ch=s.charAt(0);
       for(int i=1;i<arr.length;i++){
        int val=arr[i]-arr[i-1];
        if(val>max){
            max=val;
            ch=s.charAt(i);
        }
        else if(val == max && s.charAt(i) > ch){
                ch = s.charAt(i);
            }

       }
        return ch;
    }
}