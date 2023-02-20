package ua.lviv.lgs;

import java.util.Scanner;

public class VowelReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word here: ");
        String input = sc.nextLine().toLowerCase();
        String newString = input.replace('a', '-');
        String newString2 = input.replace('e', '-');
        String newString3 = input.replace('i', '-');
        String newString4 = input.replace('o', '-');
        String newString5 = input.replace('u', '-');
        String newString6 = input.replace('y', '-');

        System.out.println(newString);
        System.out.println(newString2);
        System.out.println(newString3);
        System.out.println(newString4);
        System.out.println(newString5);
        System.out.println(newString6);


    }
}
