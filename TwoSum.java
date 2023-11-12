class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for(int a = 0; a < nums.length; a++){
            for(int b = 0; b < nums.length; b++){
                int val = nums[a] + nums[b];
                if(val == target){
                    if(a == b) continue;
                    indexes[0] = a;
                    indexes[1] = b;
                    break;
                }
            }
        }
        return indexes;
    }
}
