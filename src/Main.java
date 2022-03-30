import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tardies tardies1 = new Tardies();

        Scanner myVar;
        String selection = "0";

        while(!(selection.equals("3"))) {
            System.out.println("MAIN MENU: ");
            System.out.println("1. Enter New Student \n2. See Class Summary \n3. Exit");

            myVar = new Scanner(System.in);
            selection = myVar.nextLine();

            if (selection.equals("1")) {
                tardies1.enterData();
            } else if (selection.equals("2")) {
                tardies1.summaryReport();
            }
        }
        if (selection.equals("3")){
            System.out.println("Exiting program");
        }
    }
}
