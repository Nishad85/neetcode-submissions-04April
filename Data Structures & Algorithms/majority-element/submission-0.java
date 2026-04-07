class Solution {
    public int majorityElement(int[] nums) {
        int size= nums.length/2;
        int result=0;
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
                hm.put(n,hm.getOrDefault(n,0)+1);
        }
       for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        if (entry.getValue() > size) {
            result= entry.getKey();
            break;
            }
        }
        return result;
    }
}