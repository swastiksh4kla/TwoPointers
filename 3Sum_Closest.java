//Time Complexity: O(n^2)
//Space Complexity: O(1)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3) return 0;
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        int n = nums.length-1;
        for(int i=0; i<n-1; i++){
            if(i>0 && nums[i]==nums[i-1])   continue;
            int left = i+1;
            int right = n;
            while(left<right){
                int currSum = nums[i]+nums[left]+nums[right];
                if(currSum==target)  return currSum;
                if(Math.abs(currSum-target)<Math.abs(closestSum-target)){
                    closestSum = currSum;
                }
                if(currSum>target)  right--;
                else    left++;
            }
        }
        return closestSum;
    }
}
