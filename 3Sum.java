//BRUTE FORCE (TLE on larger dataset)
//Time Complexity: O(n^3)  &  Space Complexity: O(m)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> l = new HashSet<>();  //storing list in set, as set contains only unique values
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> total = Arrays.asList(nums[i],nums[j],nums[k]);
                        l.add(total);
                    }
                }
            }
        }
        return new ArrayList<>(l);
    }
}


//OPTIMIZED SOLUTION
//Time Complexity: O(n^2)  &  Space Complexity: O(1)
/*
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();  //instead of storing in set, we skip duplicate number
        for(int i=0; i<nums.length; i++){
            if(i>0&& nums[i]==nums[i-1])    continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if(total==0){
                    List<Integer> curr_l = Arrays.asList(nums[i],nums[j],nums[k]);
                    l.add(curr_l);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])   j++;
                    while(j<k && nums[k]==nums[k+1])    k--;
                }
                else if(total<0)    j++;
                else k--;
            }
        }
        return l;
    }
}
*/
