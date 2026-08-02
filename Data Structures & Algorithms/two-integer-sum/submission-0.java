class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> posMap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            if(posMap.containsKey(target - n)) return new int[]{posMap.get(target - n), i};
            posMap.put(n, i);
        }
        return new int[]{0, 0};
    }
}
