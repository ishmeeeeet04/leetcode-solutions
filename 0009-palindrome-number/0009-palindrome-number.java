class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        if (x < 0) {
            return false;
        }
        int org=x;
        while (x!=0){
            
            int rem = x%10;
            x=x/10;
            rev = rev*10+rem;

        }
        if(rev==org)
        { 
            return true;
}
else{
    return false;
}
    }

}
    