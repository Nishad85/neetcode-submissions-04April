class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int unique=0;
        int duplicate_finder=1;
        while(duplicate_finder< nums.length){
            if(nums[unique]==nums[duplicate_finder]){
                duplicate_finder++;
            }
            else {
                k++;
                unique++;
                nums[unique]= nums[duplicate_finder];
                duplicate_finder++;
            }
        }
        return k;
    }
}