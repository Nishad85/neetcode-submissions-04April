class Solution {
    public void reverseString(char[] s) {
        int rev=s.length-1;
        char temp;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[rev];
            s[rev]=temp;
            rev--;
        }
        
    }
}