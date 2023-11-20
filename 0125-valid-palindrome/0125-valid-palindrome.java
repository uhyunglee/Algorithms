import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int length = s.length();
        ArrayList<Character> charArr1 = new ArrayList<>();
        ArrayList<Character> charArr2 = new ArrayList<>();
        
        for(int i = 0; i < length; i++){
            if((s.charAt(i) >= 48 && s.charAt(i)<=57) ||(s.charAt(i) + 0 >= 97 && s.charAt(i) + 0 <= 122)){
                charArr1.add(s.charAt(i));
            }
        }
        int size = charArr1.size();
        for(int j = 0; j < charArr1.size(); j++){
            charArr2.add(charArr1.get(size -1 -j));
        }
        
        return charArr1.equals(charArr2);
    }
}