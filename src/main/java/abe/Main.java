package abe;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String input = scanner.nextLine();

        System.out.println("You entered: " + input);
        System.out.println(input + "Is not a number");
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}

