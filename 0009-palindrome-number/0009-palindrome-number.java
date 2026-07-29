class Solution {
    public boolean isPalindrome(int n) {
        int temp=n;
        int rev=0;
        while(temp>0)
        {
            int rem=temp%10;
        rev=(rev*10)+rem;
        temp=temp/10;
        }
        if(rev==n)
        {
            System.out.println("palindrome");
            return true;

        }
            else
            {
            System.out.println("not");
            return false;
            }
    }
    }