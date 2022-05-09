import java.util.Arrays;
import java.util.HashMap;

class ValidAnagram { 
    public static boolean hashMapMethod(String s, String t) {
        if(s.length() == t.length()) {
            HashMap<Character, Integer> anagramChecker = new HashMap<>();
            for(int i=0;i<s.length();i++) {
                if(anagramChecker.containsKey(s.charAt(i))) {
                    int value = anagramChecker.get(s.charAt(i));
                    anagramChecker.put(s.charAt(i), value + 1);
                } else {
                    anagramChecker.put(s.charAt(i), 1);
                }
            }
            for(int i=0;i<t.length();i++) {
                if(anagramChecker.containsKey(t.charAt(i))) {
                    int value = anagramChecker.get(t.charAt(i));
                    if(value > 0)
                        anagramChecker.put(t.charAt(i), value - 1);
                    else
                        return false;
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean sortedMethod(String s, String t) {
        if(s.length() == t.length()) {
            char[] i = s.toCharArray();
            char[] j = t.toCharArray();
            // Sort the array
            Arrays.sort(i);
            Arrays.sort(j);
            // Compare the array
            return Arrays.equals(i,j);
        }
        return false;
    }
}