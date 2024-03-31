class Solution {
    public String longestCommonPrefix(String[] strs) {

    String shortestString = strs[0];
    String solution = "";
    int lengthOfShortestString = strs[0].length();

    //Use a for loop to gather the length of the shortest string

    for (int i=0; i<=strs.length-1; i++) {

    if (strs[i].length() < lengthOfShortestString) {

    lengthOfShortestString = strs[i].length();
    shortestString = strs[i];

    }//If

    }//For

    System.out.println("Shortest string is " + shortestString);

//Iterate through all the strings simultaneously
//Track the longest common prefix among all of them


    for (int i=0; i<=shortestString.length()-1; i++) {

    for (int j=0; j<=strs.length-1; j++){

        if (shortestString.charAt(i) == strs[j].charAt(i)) {
            continue;
        }//if
        else return solution;

    }

    solution = solution.concat(String.valueOf(shortestString.charAt(i)));        
    System.out.println("Solution is: " + solution);


    }//For

    
    
    return solution;
    }//method
}//class