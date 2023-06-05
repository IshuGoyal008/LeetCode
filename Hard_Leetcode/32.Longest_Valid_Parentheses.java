class Solution {
    public int longestValidParentheses(String s) {
      if(s==null || s.length()<2){
            return 0;
        }
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(i);
            } 
            else{
                if(!st.empty() && s.charAt(st.peek()) == '('){
                    st.pop();
                }
                else {
                    st.push(i);
                }
            }
        }
     
        int lo = 0;
        int hi = s.length();

        while(!st.empty()){
            int start  = st.pop();
            lo = Math.max(lo, hi - start -1);
            hi = start;
        }
        return Math.max(hi, lo); 
    }   	
}
