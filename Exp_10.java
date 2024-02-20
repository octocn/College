import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Converting Lower to Upper Case: " + str.toUpperCase());
        System.out.println("Converting Upper to Lower Case: " + str.toLowerCase());
        char firstCharacter = str.charAt(0);
        char lastCharacter = str.charAt(str.length() - 1);
        String modifiedStr = lastCharacter + str.substring(1, str.length() - 1) + firstCharacter;
        System.out.println("Replace first character with last character: \n" + modifiedStr);
        System.out.println("Original String: " + str);
        System.out.println("Removing white/empty spaces from string: \n" + str.trim());
        System.out.println("The length of string is: " + str.length());
        System.out.println("The character at 3rd position is: " + str.charAt(2));
        System.out.println("Substring from 5th position is: " + str.substring(4));
        System.out.println("Index of third character in String: " + str.indexOf(str.charAt(2)));
        System.out.println("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }
}
