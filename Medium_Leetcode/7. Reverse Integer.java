class Solution {
    public int reverse(int x) {
          long rev=0;
        while(x!=0){
            int a=x%10;
            rev=rev*10+a;
            x=x/10;
        }
        if(rev>Math.pow(2,31)-1||rev<-(Math.pow(2,31))){
            return 0;
        }
        return (int)rev;
    }
}
