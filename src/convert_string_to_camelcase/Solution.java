package convert_string_to_camelcase;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String text = "the-stealth-warrior";
        System.out.println(toCamelCase(text));
    }

    static String toCamelCase(String s){
        String[] words= s.split("[_-]+");
        return Arrays.stream(words)
                .skip(1)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .reduce(words[0], String::concat);
    }
}


/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).

toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */
