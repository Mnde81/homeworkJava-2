package lt.vcd3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);

        System.out.println("Hello ");
        System.out.println("Please enter a year: ");

        int year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){

            System.out.println("Year: " + year + " is a Leap Year");
        } else {

            System.out.println("Year: " + year + " is not a Leap Year");

        }

    }
}
