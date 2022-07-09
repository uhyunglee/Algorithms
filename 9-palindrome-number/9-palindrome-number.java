class Solution {
    public boolean isPalindrome(int isPalindrome) {
        String palindromeArray = Integer.toString(isPalindrome);
        
        for(int i=0;i<(int)palindromeArray.length()/2;i++){
           if(palindromeArray.charAt(i) == palindromeArray.charAt(palindromeArray.length()-(1+i))){
               continue;
           }else return false;
        }return true;
    }
}