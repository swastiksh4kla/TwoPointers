//Time Complexity: O(n^2)
//Space Complexity: O(log n)
class Solution {
    public int triangleNumber(int[] nums) {
        if(nums==null || nums.length<3) return 0;
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length-1;
        for(int i=n; i>=2; i--){
            int left = 0;
            int right = i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    count+=(right-left);
                    right--;
                }
                else    left++;
            }
        }
        return count;
    }
}
