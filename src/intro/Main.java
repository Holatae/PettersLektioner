package intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int times = 0;
        try {
            System.out.println("Vilket number ska vi börja räka ifrån");
            choice = scanner.nextInt();

            System.out.println("Hur många gånger skall vi räkna?");
            times = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("SKRIV ETT FUCKING TAL");
        }

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
