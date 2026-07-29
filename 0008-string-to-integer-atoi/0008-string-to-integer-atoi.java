class Solution {
    public int myAtoi(String str) {

        StringBuilder sb = new StringBuilder();
        String s = str.trim();

        if (s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {

            if (i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
                sb.append(s.charAt(i));
                continue;
            }

            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                break;
            }
        }

        if (sb.length() == 0 ||
            sb.toString().equals("-") ||
            sb.toString().equals("+")) {
            return 0;
        }

        int sign = 1;
        int start = 0;

        if (sb.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (sb.charAt(0) == '+') {
            start = 1;
        }

        long result = 0;

        for (int i = start; i < sb.length(); i++) {
            result = result * 10 + (sb.charAt(i) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (sign * result);
    }
}