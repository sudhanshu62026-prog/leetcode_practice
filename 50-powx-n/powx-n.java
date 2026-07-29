class Solution {
    public double myPow(double x, int n) {

        long power = n;   // Use long to handle Integer.MIN_VALUE

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {   // If power is odd
                result *= x;
            }

            x *= x;
            power >>= 1;              // power = power / 2
        }

        return result;
    }
}