import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        char inputChar = sc.next().charAt(0); // Read user's input as a string and extract its first character
        
        boolean isVowel = false;
        switch (inputChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
                break;
            default:
                isVowel = false;
        }
        
        String result = isVowel ? "The character '" + inputChar + "' is a vowel." : "The character '" + inputChar + "' is NOT a vowel.";
        System.out.println(result);
    }
}
