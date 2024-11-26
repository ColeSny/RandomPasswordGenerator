package RandomPasswordGenerator;

import java.util.Random;
import java.util.Scanner;
/*
 * The program will allow the user to specify the length and specify if theyd like to include:
 * Uppercase letters
 * Lowercase letters
 * Numbers
 * Special Characters
 * 
 * To do:
 * add type checking and check the final password before its sent
 */
public class RandomPasswordGenerator {
    private static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWQYZ";
        String lowercase = uppercase.toLowerCase();
        String numbers = "1234567890";
        String specials = "!@#$%^&*()-_=+,<>./?~`";

        System.out.print("Please enter the length for your password: ");
        int length = kb.nextInt();
        System.out.println(length);
        System.out.print("\nWould you like any uppercase letters? (true/false): ");
        Boolean upper = kb.nextBoolean();
        System.out.print("\nWould you like any lowercase letters? (true/false): ");
        Boolean lower = kb.nextBoolean();
        System.out.print("\nWould you like any special characters? (true/false): ");
        Boolean special = kb.nextBoolean();
        System.out.print("\nWould you like any numbers? (true/false): ");
        Boolean nums = kb.nextBoolean();

        StringBuilder chars = new StringBuilder();

        if(upper) chars.append(uppercase);
        if(lower) chars.append(lowercase);
        if(special) chars.append(specials);
        if(nums) chars.append(numbers);

        if(chars.length() == 0){
            System.out.println("No characters selected, exiting.");
            return;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; i ++){
            int idx = random.nextInt(chars.length());
            password.append(chars.charAt(idx));
        }

        System.out.println("Your password is: " + password);

    }
}