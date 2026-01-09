class Solution {
    public int countDigits(int n) {
        if (n == 0) return 1;
        return (int)(Math.log10(n)) + 1;
    }
}
