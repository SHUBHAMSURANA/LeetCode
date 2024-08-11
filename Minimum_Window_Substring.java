class Solution {
    public String minWindow(String s, String t) {

      
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : t.toCharArray()) {
            h.put(c,h.getOrDefault(c,0)+1);
        }

        HashMap<Character, Integer> bh = new HashMap<>();

        int i=0;
        int j=0;
        int hmax =0;
        String max = "";

        while(true) {
            boolean check = false;
            if (hmax < t.length() && i< s.length()) {
                char c = s.charAt(i);
                bh.put(c,bh.getOrDefault(c,0)+1);

               
                if (h.containsKey(c) && bh.get(c)-1 < h.get(c)) {
                    hmax++;
                }
               
                i++;
                check = true;
                 
            }

            if (hmax == t.length() && j<=i ) {
                String d = s.substring(j,i);
                char c = s.charAt(j);
                if (max == "") {
                    max =s;
                }
                if (d.length() < max.length()) {
                    max = d;
                }

                if (h.containsKey(c) && h.get(c)== bh.get(c)) {
                    hmax--;
                }
              

                if (bh.containsKey(c) && bh.get(c)>1) {
                    bh.put(c,bh.get(c)-1);
                    check = true;
                }
                else {
                    bh.remove(c);
                    check = true;
                }
                j++;
                 if (i ==13) {
                    System.out.println(j);
                    System.out.println(i);
                    System.out.println(bh);
                }
                
            }

            if (check == false) {
                break;
            }
        }

        
        return max;
   
    }    
}
