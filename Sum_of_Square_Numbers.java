//Time Complexity: O(sqrt(c))
//Space Complexity: O(1)
class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (long)Math.sqrt(c);
        while(i<=j){
            long currSum = (i*i)+(j*j);
            if(currSum==c)  return true;
            else if(currSum<c)  i++;
            else    j--;
        }
        return false;
    }
}
