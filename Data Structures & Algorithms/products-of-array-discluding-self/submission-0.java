class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] res= new int [n];
        for(int i=0;i<n;i++){
            res[i]=1;
        }
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=counter;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    res[i]*= nums[j];
                }
            }
            counter=0;
        }
        return res;   
    }
}  
