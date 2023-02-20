package ua.lviv.lgs;

import java.util.Locale;
import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) throws LineException {


        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your word here: ");
                String input = sc.nextLine();

                if (input.length() == 5) {
                    StringBuilder sb = new StringBuilder(input);
                    sb.reverse();
                    if (input.equalsIgnoreCase(sb.toString())) {
                        System.out.println("Palindrome");
                    }
                } else {
                    throw new LineException("Wrong line");
                }
            } catch (LineException l) {
                System.err.println(l.getMessage());
            }

        }


    }
}



