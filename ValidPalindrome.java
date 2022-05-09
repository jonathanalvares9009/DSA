class ValidPalindrome {
    public static boolean originalIsEqualToReverse(String s) {
        StringBuilder palinString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
           if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
               palinString.append(String.valueOf(s.charAt(i)).toLowerCase());
           }
        }
        if(palinString.length()==0) return true;
        StringBuilder temp= new StringBuilder(palinString);
        return temp.toString().equals(palinString.reverse().toString());
    }

    public static boolean twoPointers(String s) {
        StringBuilder palinString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
           if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
               palinString.append(String.valueOf(s.charAt(i)).toLowerCase());
           }
        }
        if(palinString.length()==0) return true;
        int low = 0, high = palinString.length() - 1;
        while(low <= high) {
            if(palinString.charAt(low) != palinString.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
