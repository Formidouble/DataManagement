import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int die1=1;
        int die2=1;
        System.out.println("What is your name? ");
        System.out.print(">");
        String dname = scanner.nextLine();
        System.out.println("Hello, "+dname);
        die1 += rand.nextInt(6);
        die2 += rand.nextInt(6);
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: "+die1);
        System.out.println("Die 2: "+die2);
        System.out.println("Total value: "+(die1+die2));
    }
}
