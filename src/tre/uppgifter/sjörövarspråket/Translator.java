package tre.uppgifter.sjörövarspråket;

import java.util.ArrayList;
import java.util.Arrays;

public class Translator {
    String[] konsonanter = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M",
            "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Z"};
    private String swedishString;
    private String pirateString;

    public String getSwedishString() {
        return swedishString;
    }

    public void setSwedishString(String swedishString) {
        this.swedishString = swedishString;
        pirateString = translateToPirateSpeech(swedishString);
    }

    public String getPirateString() {
        return pirateString;
    }

    public void setPirateString(String pirateString) {
        this.pirateString = pirateString;
        swedishString = translateToSwedish(pirateString);
    }

    private String translateToPirateSpeech(String swedishString){
        String[] swedishArray = swedishString.split("");
        ArrayList<String> newTranslatedArray = new ArrayList<String>();

        //For each loop
        for (String letter: swedishArray
             ) {
                if (Arrays.asList(konsonanter).contains(letter.toUpperCase())){
                    newTranslatedArray.add(letter);
                    newTranslatedArray.add("o");
                    newTranslatedArray.add(letter.toLowerCase());
                }
                else {
                    newTranslatedArray.add(letter);
                }
        }
        return String.join("", newTranslatedArray);
    }

    private String translateToSwedish(String pirateString){
        String[] pirateArray= pirateString.split("");

        int index = 0;
        for (String letter: pirateArray
             ) {
            if (index + 2 >= pirateArray.length){ break;}
            if(letter.compareTo(pirateArray[index + 2 ]) == 0 &&
                    pirateArray[index + 1].compareTo("o") == 0){
                pirateArray[index + 1] = "";
                pirateArray[index + 2] = "";
            }
            index++;
        }
        return String.join("", pirateArray);

    }
}
