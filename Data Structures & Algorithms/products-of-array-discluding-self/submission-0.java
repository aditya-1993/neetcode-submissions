class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int l = 1;
        for(int i = 0 ; i < n ; i++){
            left[i] = l;
            l = l * nums[i];
        }
        int[] output = new int[n];

        int r = 1;
        for(int i = n - 1 ; i >= 0 ; i--){
            output[i] = left[i] * r;
            r = r * nums[i];
        }
        return output;
    }
}  
