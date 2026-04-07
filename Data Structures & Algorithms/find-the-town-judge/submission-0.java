class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] incoming_trust= new int[n+1];
        int[] outgoing_trust= new int[n+1];
        for(int[] t : trust){
            incoming_trust[t[1]]++;
            outgoing_trust[t[0]]++;
        }
        for(int i=0;i<=n;i++){
            if(incoming_trust[i]==n-1 && outgoing_trust[i]==0){
                return i;
            }
        }
        return -1;
    }
}