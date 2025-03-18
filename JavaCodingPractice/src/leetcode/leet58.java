package leetcode;

class leet58 {
    static int lengthOfLastWord(String s) {
    	
        int l=0;
        int len=s.length()-1;
        
        while(s.charAt(len)==' '){
            len--;
        }
        while(len>=0 && s.charAt(len)!=' '){
            len--;
            l++;
        }
        return l;
    }
    
    public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
	}
}