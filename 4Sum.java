//BRUTE FORCE (TLE on large dataset)
//Time Complexity: O(n^4)  &  Space Complexity: O(m)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    for(int l=k+1; l<nums.length; l++){
                        long total = (long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                        if(total==target){
                            List<Integer> list1 = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            set.add(list1);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}



//OPTIMIZED SOLUTION
//Time Complexity: O(n^3)  &  Space Complexity: O(1)
/*
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> f_list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1])   continue;
            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j]==nums[j-1])  continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long total = (long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(total==target){
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        f_list.add(list);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1])    k++;
                        while(k<l && nums[l]==nums[l+1])    l--;
                    }
                    else if(total<target)   k++;
                    else l--;
                }
            }
        }
        return f_list;
    }
}
*/
