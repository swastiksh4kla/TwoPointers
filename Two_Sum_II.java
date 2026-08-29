//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start= 0;
        int last= numbers.length-1;

        while(start<last){
            if(numbers[start]+numbers[last]==target){
                return new int[]{start+1, last+1};
            }
            else if(numbers[start]+numbers[last]>target){
                last--;
            }
            else{
                start++;
            }
        }
        return new int[]{};
    }
}
