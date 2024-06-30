public class StringPermutation {
    public static void main (String[] args) { 
        String str = "abc"; 
        permuation(str,""); 
    
    } 
    
    public static void permuation(String cstr, String rstr) { 
        if (cstr.length() == 0) 
        { 
             System.out.println(rstr); 
        } 
    
        for (int i=0; i<cstr.length();i++) { 
    
            char a = cstr.charAt(i); 
    
            String f = cstr.substring(0,i); 
            String l = cstr.substring(i+1); 

            // If String cstr = 'a' then
            // cstr.substring(0,0) give empty string
            // cstr.substring(1) give empty string
    
            String r = f+l; 
            permuation(r, rstr+a); 
    
        } 
    } 
}
