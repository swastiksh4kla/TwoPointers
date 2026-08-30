//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        int start= 0;
        int last= nums.length-1;

        while(start<=last){
            if(nums[start]==val){
                nums[start]=nums[last];
                last--;
            }
            else{
                start++;
            }
        }
        return start;
    }
}
