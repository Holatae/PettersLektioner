package tre.uppgifter.slumpa.namn;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        initializeNames(firstNames, lastNames);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur många namn vill du generera?");
        int times = scanner.nextInt();
        int counter = 0;
        while (counter < times){
            String firstName = firstNames.get(random.nextInt(0, firstNames.size()));
            String lastName = lastNames.get(random.nextInt(0, lastNames.size()));
            System.out.printf("%s %s\n", firstName, lastName);
            counter++;
        }

    }

    private static void initializeNames(ArrayList<String> firstNames, ArrayList<String> lastNames) {
        firstNames.add("Victor");
        firstNames.add("Sture");
        firstNames.add("Hans");
        firstNames.add("Adolf");
        firstNames.add("Petter");
        firstNames.add("Hugo");
        firstNames.add("Samuel");
        firstNames.add("Loke");
        firstNames.add("Edina");
        firstNames.add("Malva");
        firstNames.add("Sigrid");

        lastNames.add("Andersson");
        lastNames.add("Sturesson");
        lastNames.add("Hansson");
        lastNames.add("Segerstedt");
        lastNames.add("Forslund");
        lastNames.add("Sedin");
        lastNames.add("Lundkvist");
        lastNames.add("Lundqvist");
        lastNames.add("Berglund");
        lastNames.add("Olovsson");
    }

}
