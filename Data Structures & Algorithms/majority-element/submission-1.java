class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int output=0;
        int majority = nums.length/2;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()>majority){
                output= entry.getKey();
            }
        }
        return output;
    }
}