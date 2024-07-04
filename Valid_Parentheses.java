class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> l = new HashMap<Character, Character>();

        l.put(')','(');
        l.put(']','[');
        l.put('}','{');
        
        Stack<Character> t = new Stack<>();
        String a = ")]}";
        String b = "([{";

    
        for (char c :s.toCharArray()) {
            if (b.indexOf(c) != -1) {
                t.push(c);
            }
            else {
                if (!t.empty()) {
                    char x = t.pop();
                    if (x != l.get(c)) {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        
        if (t.empty()) {
            return true;
        }
        return false;
    }
}
