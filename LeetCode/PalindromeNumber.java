public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        String s = String.valueOf(x);
        int n = s.length();

        // Why does solution suggest n/2 instead of just n?
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }

        return true;
    }

}
