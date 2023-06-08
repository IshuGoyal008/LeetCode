class Solution {
static String[] key= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()!=0){
            printKeypaid(digits,"",list);
            return list;
        }
        else{
            return list;
        }
    }
    public static void printKeypaid(String ques,String ans,List<String> list) {
		if(ques.length()==0) {
			list.add(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		String pressString = key[ch-48];
		for(int i=0;i<pressString.length();i++) {
			printKeypaid(ques.substring(1), ans+pressString.charAt(i),list);
		}
		
	}

}
