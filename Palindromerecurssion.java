public class Palindromerecurssion {
    public static void main (String[] args) { 

        String str = "abba";
        System.out.println("To check if palindrome");
        boolean x = palindrome(str,0,str.length()-1);
        System.out.println("To check if palindrome" + x);
    
    } 

    static boolean palindrome(String s, int l, int r) {
        if (l>=r) {
            return true;
        }
        if (s.charAt(l)!= s.charAt(r)) {
            return false;
        }
        return (palindrome(s,l+1,r-1));
    }
}
