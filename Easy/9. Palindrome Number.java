class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int rev=0;;
        while(x>0){
        int y=x%10;
        rev=rev*10+y;
        x=x/10;
        }
        if(rev==a){
            return true;
        }
        else{
            return false;
        }
    }
}
