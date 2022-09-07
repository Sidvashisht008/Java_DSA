public class palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("abcba"));
		System.out.println(checkPalindrome("abcdea"));
	}
	
	public static boolean checkPalindrome(String str) {
		int lo = 0;
		int hi = str.length()-1;
		while(lo<hi) {
			if(str.charAt(lo)!=str.charAt(hi)) {
				return false;
			}
			lo++;
			hi--;
		}
		return true;
	}

}
