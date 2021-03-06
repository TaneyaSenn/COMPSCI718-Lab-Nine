package ictgradschool.industry.lab09.ex06;

import java.util.Map;

/**
 * Main program for Lab 09 Ex 6, which should print out a table showing the frequency of all alphanumeric characters
 * in a text block.
 */
public class ExerciseSix {

    /**
     * Loops through the given String and builds a Map, relating each alphanumeric character in the String (key)
     * with how many times that character occurs in the string (value). Ignore case.
     *
     * @param text the text to analyze
     * @return a mapping between characters and their frequencies in the text
     */
    private Map<Character, Integer> getCharacterFrequencies(String text) {

        // Ignore case. We need only deal with uppercase letters now, after this line.
        text = text.toUpperCase();

        // TODO Initialize the frequencies map to an appropriate concrete instance
        Map<Character, Integer> frequencies = null;

        // Loop through all characters in the given string
        for (char c : text.toCharArray()) {

            // If c is alphanumeric...
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {

                // TODO If the map already contains c as a key, increment its value by 1.
                // TODO Otherwise, add it as a new key with the initial value of 1.

            }

        }

        // TODO BONUS: Add any missing keys to the map
        // (i.e. loop through all characters from A-Z and 0-9. If that character doesn't appear in the text,
        // add it as a key here with frequency 0).

        return frequencies;

    }

    /**
     * Prints the given map in a user-friendly table format.
     *
     * @param frequencies the map to print
     */
    private void printFrequencies(Map<Character, Integer> frequencies) {

        System.out.println("Char:\tFrequencies:");
        System.out.println("--------------------");

        // TODO Loop through the entire map and print out all the characters (keys)
        // TODO and their frequencies (values) in a table.

    }

    /**
     * Main program flow. Do not edit.
     */
    private void start() {
        Map<Character, Integer> frequencies = getCharacterFrequencies(Constants.TEXT);
        printFrequencies(frequencies);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        new ExerciseSix().start();
    }
}
