class Solution {
    public boolean isPalindrome(String s) {
       
       String r = s.replaceAll("[^a-zA-Z0-9]", "");
       //^[a-zA-Z] means any a-z or A-Z at the start of a line
       // [^a-zA-Z] means any character that IS NOT a-z OR A-Z
       
       r = r.toLowerCase();  // IT WILL NOT MODIFY STRAING

       return r.equals(new StringBuffer(r).reverse().toString());
        
    }
}