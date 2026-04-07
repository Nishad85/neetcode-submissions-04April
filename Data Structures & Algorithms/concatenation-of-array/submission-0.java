class Solution {
    public int[] getConcatenation(int[] nums) {
        int len= nums.length +nums.length;
        int[] resArray= new int[len];
        for(int i=0;i<nums.length;i++){
            resArray[i]= nums[i];
        }
        int counter=0;
        for(int i= nums.length;i<len;i++){
            resArray[i]= nums[counter];
            counter++; 
        }
        return resArray;
    }
}