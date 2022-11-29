class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 10 && x > -10) {
            return x;
        }
        boolean isPositive = x >= 0;
        if (!isPositive) {
            x = -x;
        }
        List<Integer> digits = new ArrayList<>();
        do {
            digits.add(x % 10);
            x /= 10;
        } while (x > 0);
        if (digits.get(0) == 0) {
            digits.remove(0);
        }
        int result = 0;
        for (int i = 0; i < digits.size(); ++i) {
            result += digits.get(i);
            if (i < digits.size() - 1) {
                result *= 10;
            }
        }
        int resultCheck = result;
        int i = digits.size() - 1;
        do {
            if (digits.get(i--) != resultCheck % 10) {
                return 0;
            }
            resultCheck /= 10;
        } while (resultCheck > 0);
        return isPositive ? result : -result;
    }
}
