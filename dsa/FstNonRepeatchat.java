
package dsa_TCS_NQT;

import java.util.HashMap;

public class FstNonRepeatchat {

    public static int firstNonRepeatingCharacter(String nums) {

        HashMap<Character, Integer> map = new HashMap<>();//{key:values,...}

        // Count frequency of each character
        for (char ch : nums.toCharArray()) {

            if (map.containsKey(ch)) {//check whether map has element
                map.put(ch, map.get(ch) + 1);//1st time its empty//5th time 'l' 2nd time exist  map.get(ch)->value is returned(already has)1+(now)1=2 l=1+1=2 
            } else {
                map.put(ch, 1);//else part for is used for non repeat elemet
            }
        }
        // Find first character whose index's frequency is 1
        for (int i=0;i<nums.length();i++) {

            if (map.get(nums.charAt(i)) ==1 ) {
                return i;
            }
        }

        return -1;
    }
    // if they ask for us to return a character 
    /*for (char ch : nums.toCharArray()) {
    if (map.get(ch) == 1) {
        return ch;
    }
}*/

    public static void main(String[] args) {

        String nums = "loveleetcode";

        int result = firstNonRepeatingCharacter(nums);

        System.out.println("First non-repeating character: " + result);
    }
}

