import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int rem = x % 10;
            x /= 10;
            
            // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            
            rev = rev * 10 + rem;
        }
        
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        Solution sol = new Solution();
        int reversed = sol.reverse(num);
        System.out.println(reversed);
    }
}