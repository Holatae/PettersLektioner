package intro;

import java.util.Scanner;

public class Faktisktuppgift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(text);

        if (stringBuilder.length() <= 2){
            System.err.println("DU HAR GJORT FEL MOAHAHAHAHHAHA");
            return;
        }
        System.out.println(stringBuilder.reverse());

        System.out.println("Klicka enter för att få en loop bara för att det behövs");
        scanner.next();

        int choice = 4;
        int times = 6;

        count(choice, times);
    }


    private static void count(int choice, int times) {
        int i = 0;
        while (i  <= times){
            System.out.println(choice);
            choice++;
            i++;
        }
    }
}
