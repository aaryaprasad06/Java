class Solution {
    public boolean isPalindrome(int x) {
        int n=x, rev=0;
        while(n>0)
        {
            int a= n%10;
            rev= rev*10+ a;
            n= n/10;
        }
        if(rev==x)
        return true;
        else
        return false;
    }
}