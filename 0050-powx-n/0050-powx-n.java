class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return powHelper(x, N);
    }

    private double powHelper(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double half = powHelper(x, n / 2);
        double result = half * half;
        if (n % 2 != 0) {
            result *= x;
        }
        return result;
    }
}
