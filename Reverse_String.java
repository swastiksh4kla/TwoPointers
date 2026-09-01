//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int last = s.length-1;

        while(start < last){
            char temp = s[start];
            s[start++] = s[last];
            s[last--] = temp;
        }
    }
}
