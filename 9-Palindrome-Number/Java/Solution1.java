class Solution {
    public boolean isPalindrome(int x) {
        
        String xString = Integer.toString(x);
        
        //Two pointers: one at the start of the string, one at the end
        //The pointer at the start of the string advances from left to right
        //The pointer at the end of the string advances from right to left
        //If both pointers hold the same character throughout the entire loop,
        //the string is a palindrome
        
        int i=0;
        int j=xString.length()-1;

        while (i < j) {

        if (xString.charAt(i) != xString.charAt(j)) {

            return false;

        }//if

        //if the pointers hold the same character, continue
        i++;
        j--;


        }//While
       

        //Otherwise, it's a palindrome
        return true;

    }//Method
}//Class