package lt.vcd2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner in=new Scanner(System.in);

        System.out.println("Hello ");
        System.out.println("Please enter hours: ");
        int h = in.nextInt();

        System.out.println("Please enter minutes: ");
        int m = in.nextInt();

        System.out.println("Please enter seconds: ");
        int s = in.nextInt();

        s++;

        if (s == 60) {
            m++;
            s = 0;
            if (m == 60) {
                h++;
                m = 0;
            }


                if (h == 24) {
                    h = 0;
                }

        }

        System.out.println("One second later the digital clock will display: " + h + ":" + m + ":" + s);

    }
}
