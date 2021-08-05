import java.util.Scanner;

public class Driver {

    public static void menu() {
        System.out.println("\t\t********** Welcome to Pizza Shop **********\n" +
                "\t\tWe will first request for some personal details to add to your order" +
                "and then present you with our Pizza Menu including the prices.\n" +
                "\t\tPlease follow the instructions and place your order!");
    }

    public static void personalDetails() {
        System.out.println("\t\tCould you please enter your personal details in the following order: \n" +
                "\t\t\tFirst Name\n" +
                "\t\t\tSurname\n" +
                "\t\t\tEmail");
    }

//    utilising the .equals() to assess value of detailConfirmation variable
    public static void confirmation() {
        System.out.println("Please confirm Yes/ No to confirm your details/ order :");
        Scanner scan = new Scanner(System.in);
        String detailConfirmation = scan.nextLine();
        if (detailConfirmation.equals("Yes")) {
            System.out.println("Please continue with your order.");
        } else if (detailConfirmation.equals("No")) {
            System.out.println("Please re-enter your personal details in the above format.");
            String revisedFN = scan.nextLine();
            String revisedSN = scan.nextLine();
            String revisedEM = scan.nextLine();
            System.out.println("Your personal details are as follows : \n" +
                    "First Name : " + revisedFN + "\n" +
                    "Surname : " + revisedSN + "\n" +
                    "Email : " + revisedEM);
        } else {
            System.out.println("Please enter an answer");
        }
    }

    public static void main (String[] args) {

        menu();
        personalDetails();

//        Recording users personal details
        Scanner scan = new Scanner(System.in);
        String fN = scan.nextLine();
        String sN = scan.nextLine();
        String eM = scan.nextLine();
        System.out.println("Your personal details are as follows : \n" +
                "First Name : " + fN + "\n" +
                "Surname : " + sN + "\n" +
                "Email : " + eM);

        confirmation();

    }
}
