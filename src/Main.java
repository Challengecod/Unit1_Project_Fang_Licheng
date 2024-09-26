//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df_obj = new DecimalFormat("#.00"); // formats the decimal to two trailing decimals.
        System.out.print("*");
        System.out.print("NOTE! Don't use any symbols when inputting data! (NO $ OR %)"); // print statement to notify user to not input symbols
        System.out.println("*");

        Scanner s = new Scanner(System.in); // Scanner accepts inputs

        // User Inputs and string conversion to a double or integer:
        System.out.print("Enter your bill ($): ");
        String billStr = s.nextLine(); // contains the bill as a string
        double bill = Double.parseDouble(billStr); // bill is converted into a double for later calculations

        System.out.print("Tip Percentage: "); 
        String tipStr = s.nextLine(); // contains the tips as a string
        int tip = Integer.parseInt(tipStr); // tip is converted into a integer for later calculations

        System.out.print("Number of Humans: ");
        String numPeopleStr = s.nextLine(); // contains the number of people as a string datatype
        int numPeople = Integer.parseInt(numPeopleStr); // number of people is converted into a integer for later calculations

        // Calculating the total tips and converting it to a decimal
        final double tips = 0.01; // the final tips converter is 100 percent
        double tipDecimal = tips * tip; // tips as a decimal is to multiply by 0.01
        double totalTipAmount = tipDecimal * bill; // find the tip amount multiply the tip in decimal form to the total bill cost

        //Calculate total bill:
        double totalBillCost = totalTipAmount + bill; // adds the total tips to the bill to get the total cost after tips

        //Calculate both tip and total per person
        double tipPerPerson = totalTipAmount/numPeople; // divide the total tip amount by the number of people to get per person.

        double totalBillPerPerson = totalBillCost/numPeople; // divide the total cost amount by the number of people to get per person.

        System.out.println("---------------------------");
        System.out.println("Total Tip Amount: $" + df_obj.format(totalTipAmount));
        System.out.println("---------------------------");
        System.out.println("Total Bill cost: $" + df_obj.format(totalBillCost));
        System.out.println("---------------------------");
        System.out.println("Tip Per Person: $" + df_obj.format(tipPerPerson));
        System.out.println("---------------------------");
        System.out.println("Total Bill Per Person: $" + df_obj.format(totalBillPerPerson));
        System.out.println("---------------------------");
        System.out.println("The End");


    }
}
