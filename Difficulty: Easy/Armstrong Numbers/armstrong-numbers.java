class Solution {
    static boolean armstrongNumber(int n) {
        int dup = n;
        int sum = 0;
        int pow = 0;

        int temp = n;
        while (temp != 0) {
            pow++;
            temp /= 10;
        }

        while (dup != 0) {
            int last_digit = dup % 10;
            sum += Math.pow(last_digit, pow);
            dup /= 10;   
        }

        return sum == n;
    }
}
