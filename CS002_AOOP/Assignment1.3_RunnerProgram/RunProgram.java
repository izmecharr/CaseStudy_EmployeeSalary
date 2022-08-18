import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        // Choose network
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Choose your network.");
        System.out.println("[s] Smart");
        System.out.println("[t] Talk n' text");
        System.out.println("[g] Globe");
        System.out.println("");

        char myNetwork = ' ';
        while (true) {
            System.out.print("Enter your network: ");
            char inputNetwork = input.next().charAt(0);
            if (inputNetwork == 's' || inputNetwork == 't' || inputNetwork == 'g') {
                myNetwork = inputNetwork;
                break;
            } else {
                System.out.println("Oops! Try again");
                continue;
            }

        }
        MobilePhone3 phone = new MobilePhone3(myNetwork);
        pressEnterKeyToContinue();
        cls();

        while (true) {
            // options: check balance, reload, call, text
            // Main program
            System.out.println("*** M A I N   P R O G R A M ***");
            System.out.println("[1] Check Balance");
            System.out.println("[2] Reload");
            System.out.println("[3] Call");
            System.out.println("[4] Text");
            System.out.println("[5] Exit Program");
            System.out.println("");
            System.out.print("Enter your choice: ");
            int mainChoice = input.nextInt();
            System.out.println("");

            switch (mainChoice) {
                case 1:
                    System.out.println("[Check Balance]");
                    System.out.println("Your total balance is: " + phone.checkBalance());
                    pressEnterKeyToContinue();
                    cls();
                    break;
                case 2:
                    System.out.println("[Reload]");
                    System.out.print("Amount to load: ");
                    int amount = input.nextInt();
                    phone.reload(amount);
                    System.out.println("An amount of " + amount + " has been added.");
                    pressEnterKeyToContinue();
                    cls();
                    break;
                case 3:
                    System.out.println("[Call]");
                    System.out.print("How many minutes? ");
                    int minutes = input.nextInt();
                    System.out.println("");

                    System.out.println("Network to call: ");
                    System.out.println("[s] Smart");
                    System.out.println("[t] Talk n' text");
                    System.out.println("[g] Globe");
                    System.out.print("Network: ");
                    char callNetwork = input.next().charAt(0);
                    phone.call(minutes, callNetwork);
                    pressEnterKeyToContinue();
                    cls();
                    break;
                case 4:
                    System.out.println("[Text]");
                    int length = 0;
                    while (true) {
                        System.out.print("Length of text [MAX 160]: ");
                        int textLength = input.nextInt();
                        if (textLength > 160) {
                            System.out.println("Try again.");
                            continue;
                        }

                        if (textLength <= 160) {
                            length = textLength;
                            break;
                        }
                    }
                    System.out.println("");

                    System.out.println("Network to text: ");
                    System.out.println("[s] Smart");
                    System.out.println("[t] Talk n' text");
                    System.out.println("[g] Globe");
                    System.out.print("Network: ");
                    char textNetwork = input.next().charAt(0);

                    phone.text(length, textNetwork);
                    pressEnterKeyToContinue();
                    cls();
                    break;
                case 5:
                    System.out.println("[Exit Program]");
                    exitProgram();
                    break;
                default:
                    System.out.println("Oops! Try again.");
                    pressEnterKeyToContinue();
                    cls();
            }

        }

    }

    // extra
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public static void pressEnterKeyToContinue() {
        System.out.println("");
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    public static void exitProgram() {
        System.out.println("Exiting program...");
        System.exit(0);
    }
}