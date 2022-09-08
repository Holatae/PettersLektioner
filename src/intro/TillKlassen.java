package intro;

import java.util.Scanner;

public class TillKlassen {
    public static void main(String[] args) {
        System.out.println("Hej skriv in något:");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if(!answer.equalsIgnoreCase("nazistpartiet")){
            System.out.println("Du har fel");
        }
        else{
            System.out.println(answer);
        }

    }
}
