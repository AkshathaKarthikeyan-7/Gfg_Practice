// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int rev_num = 0;
        while(n > 0){
            int last_digit = n % 10;
            n = n/10;
            rev_num = (rev_num * 10) + last_digit;
        }
        return rev_num;
        
    }
}