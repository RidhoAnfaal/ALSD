package assignment;

import java.util.Stack;

public class number1 {
    public static String reverseString(String str) {
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        int index = 0;
        while (!stack.isEmpty()) {
            reverseString[index++] = stack.pop();
        }

        return new String(reverseString);
    }

    public static void main(String[] args) {
        String sentence = "Politeknik Negeri Malang";
        String reversedSentence = reverseString(sentence);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
