class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = {0,0};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                res[0]=map.get(req);
                res[1]=i;
            }
            else
                map.put(nums[i],i);
        }
        return res;
    }
}