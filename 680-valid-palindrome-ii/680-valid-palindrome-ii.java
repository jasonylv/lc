class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while ( l < r ) 
            if ( s.charAt(l++) != s.charAt(r--) )
                return valid(s,l-1,r) || valid(s,l,r+1);
        return true;
    }
    boolean valid(String s, int l, int r) {
        while ( l < r ) 
            if ( s.charAt(l++) != s.charAt(r--) )
                return false;
        return true;
    }
}