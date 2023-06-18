class Solution {
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList<>();
         List<List<String>> ans=new ArrayList<>();
         fun(s,list,ans);
         return ans;
    }
    public static void fun(String ques,List<String> list, List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(list));
            
        }

        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(ispalindrome(s)){
                list.add(s);
                fun(ques.substring(i),list,ans);
                list.remove(list.size()-1);
            }
        }
    }

    public static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
