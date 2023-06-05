class Solution {
    public boolean isValid(String s) {
        return isvalid(s);
    }

    public static boolean isvalid(String s) {
		Stack<Character> st=new Stack<>();
		char a;
		
		for (int i = 0; i < s.length(); i++) {
			
			
			if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(') {
				
				st.push(s.charAt(i));
				continue;
			}
			
			if(st.isEmpty()) {
				return false;
			}
			
			switch(s.charAt(i)) {
			
			case '}':
				a=st.peek();
				st.pop();
				
				if(a==']' ||a==')'||a!='{') {
					return false;
					
				}
				
				break;
				
			case ')':
				a=st.peek();
				st.pop();
				
				if(a==']' ||a=='}'||a!='(') {
					return false;
					
				}
				
				break;
				
			case ']':
				a=st.peek();
				st.pop();
				
				if(a=='}' ||a==')'||a!='[') {
					return false;
					
				}
				
				break;
			}
			
			
		}
		
		return st.isEmpty();
	}
}
