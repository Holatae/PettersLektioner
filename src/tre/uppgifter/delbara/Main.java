package tre.uppgifter.delbara;

public class Main {

    public static void main(String[] args) {
        try {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);

            if (firstNumber % secondNumber == 0){
                System.out.println("TRUE");
            }
            else {
                System.out.println("FALSE");
            }
        } catch (NumberFormatException e) {
            System.err.println("Ge 2 argument. Första är första talet andra är andra talet");
        }
    }
}
