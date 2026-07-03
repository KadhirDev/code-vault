import java.lang.*;
class Solution {
    public int reverse(int x) {
        boolean ne = x<0;
        long num = Math.abs((long)x);
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        if(ne){
            sb.insert(0,'-');
        }
        long res = Long.parseLong(sb.toString());
         if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int)res;
    }
}