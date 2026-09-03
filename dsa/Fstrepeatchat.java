
package dsa_TCS_NQT;

import java.util.LinkedHashSet;

public class Fstrepeatchat {

    public static char firstRepeatingCharacter(String nums) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        char a[] = nums.toCharArray();

        for (char num : a) {

            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return '\0';   // no repeating character
    }

    public static void main(String[] args) {

        String nums = "loveleetcode";

        char result = firstRepeatingCharacter(nums);

        System.out.println("First repeating character: " + result);
    }
}
