//Time Complexity: O(nlogn)
//Auxiliary Space Complexity: O(1)  &  Sorting Space Complexity: O(n)
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people==null || people.length==0)    return 0;
        Arrays.sort(people);
        int boat = 0;
        int l = 0;
        int r = people.length-1;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
            }
            r--;
            boat++;
        }
        return boat;
    }
}
