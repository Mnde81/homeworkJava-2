package lt.vcd1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner in=new Scanner(System.in);

        System.out.println("Hello ");
        System.out.println("Please enter a year: ");

        int m = in.nextInt();

        int e = 1;

        if (m >= 1896 && m % 4 == 0){

            e += (m - 1896) / 4;

            System.out.println("Year: " + m + " is Olympic Year and Edition number is " + e);
        } else {

            System.out.println("Year: " + m + " is not Olympic Year");

        }
    }
}
