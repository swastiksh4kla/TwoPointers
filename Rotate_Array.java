//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<=1)    return;
        int n = nums.length;
        k=k%n;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    //Helper Method for reversing array
    private void reverse(int[] nums, int start, int last){
        while(start<last){
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            last--;
            start++;
        }
    }
}
