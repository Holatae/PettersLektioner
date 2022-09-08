package tre.uppgifter.sjörövarspråket;

import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("Vad vill du göra?");
        System.out.println("1. Translate to piratespeech from swedish");
        System.out.println("2. translate from piratespeech to swedish");

        int input = scanner.nextInt();
        switch (input){
            case 1:
                translateToPirate();
                break;
            case 2:
                translateToSwedish();
                break;

        }
    }

    private void translateToPirate(){
        System.out.println("What is the Swedish string?");
        String swedishString = scanner.next();
        Translator translator = new Translator();

        translator.setSwedishString(swedishString);
        System.out.println(String.format("The string in piratespeech is: %s", translator.getPirateString()));
    }

    private void translateToSwedish(){
        System.out.println("What is the Pirate String");
        String pirateString = scanner.next();
        Translator translator = new Translator();

        translator.setPirateString(pirateString);
        System.out.println(String.format("Thr string in Swedish is: %s", translator.getSwedishString()));
    }
}
