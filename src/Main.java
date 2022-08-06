import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        Random random=new Random();
        int numrandom= random.nextInt(15);

        int i=0;
        do {
            System.out.print("Number write: ");
            int n = scanner.nextInt();
            if (i == 3) {

                System.out.println("Defeat.......!!!");
                break;
            } else if (n == numrandom) {
                System.out.println("Victory ! ! !");
                break;
            } else if (n > numrandom) {
                System.out.println("Write number big");

            } else if (n < numrandom) {
                System.out.println("Write number small");

            } else {
                System.out.println("Number error");
            }
            i++;



            System.out.println(i+"-there is a chance");


        }while (true);


















    }
}